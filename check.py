from pathlib import Path
import subprocess
import tempfile
ROOT = Path(__file__).resolve().parent
with tempfile.TemporaryDirectory(prefix="coursework-check-") as build:
    sources = sorted((ROOT/"src").glob("*.java")) + sorted((ROOT/"tests").glob("*.java"))
    subprocess.run(["javac", "--release", "8", "-proc:none", "-encoding", "UTF-8", "-d", build, *map(str, sources)], check=True, timeout=30)
    subprocess.run(["java", "-cp", build, "BankTest"], check=True, timeout=15)
    result = subprocess.run(["java", "-cp", build, "TestBank"], input='1\nAlex 100\n4\nAlex 100\n7\nAlex\n9\n', text=True, capture_output=True, check=True, timeout=15)
    assert 'Alex 0.0 SR' in result.stdout, result.stdout
    print("TestBank: synthetic console interaction passed.")
