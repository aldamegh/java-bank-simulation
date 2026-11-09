# Java Bank Simulation

An in-memory, menu-driven bank simulation using classes and fixed-capacity arrays. It supports client creation/deletion, deposits, withdrawals, transfers, and balance lookup.

## Course and original date

- **Course / المادة:** CSC 111 - Computer Programming I / برمجة الحاسبات 1, King Saud University.
- **Original project period / تاريخ المشروع الأصلي:** 11-12 December 2020.
- **Evidence:** The original Eclipse `AldameghFinal` Java files retain modification dates of 11-12 December 2020. These dates identify the surviving project version, not a verified submission time.

The original coursework dates above are distinct from the GitHub publication and maintenance date, **9 November 2026**. The original source files were preserved locally.

## Run

JDK 11 or newer with `javac` and `java` on PATH; Java 8-compatible output. No external Java dependencies.

```sh
mkdir build
javac --release 8 -encoding UTF-8 -d build src/*.java
java -cp build TestBank
```

## Verification

```sh
python check.py
```

26 banking assertions and a scripted console interaction passed. Checks use newly authored synthetic inputs only. See [CHANGES.md](CHANGES.md) for the publication changes and validation scope.

## Scope and provenance

Educational example with no persistence or authentication. Uses `double` for example amounts and single-word client names; it is not banking software.

Published from the owner's local coursework. Course briefs, slides, exams, student identifiers, faculty names, real datasets, collected email, credentials, IDE history, and compiled files are excluded. Academic material may include supplied interfaces or collaborative code; no claim of sole authorship of all scaffolding and no blanket license is made.

Course titles are cross-checked against the [KSU computer science course catalog](https://ccis.ksu.edu.sa/en/cs/cs-prog-guides). Original local evidence is retained privately rather than publishing the source briefs/reports.
