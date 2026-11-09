// Mohammed AlDamegh

public class Bank {

			private String names[];

			private double balances[];

			private int nClients;


	public Bank() { this(50); }

		public Bank(int size ) {
			if (size < 0) throw new IllegalArgumentException("Capacity cannot be negative");
            nClients=0;

			names = new String[size];

			balances = new double[size];
		}

		public int findIndexByName(String name ) {

		for(int i=0 ; i<nClients; i++) {

			if(names[i].equalsIgnoreCase(name)) {

				return i;
				}
			}
			return -1;

		}

		public boolean addClient(String name , double balance) {


			if (name == null || name.trim().isEmpty() || !Double.isFinite(balance) || balance < 0) return false;
            if(nClients<names.length) {

			if(findIndexByName(name)==-1) {
			names[nClients]= name;
			balances[nClients] = balance;

			nClients++;
			return true;
			}

			}
			return false;

		}




		public boolean deleteClient(String name ) {

			for(int i=0; i<nClients;i++) {

			if (names[i].equalsIgnoreCase(name)) {
				names[i]= names[nClients-1];
				balances[i]= balances[nClients-1];
			nClients--;
			return true;
				}
			}

			return false;
		}


        public boolean deposit(String name, double amount) {
            int index = findIndexByName(name);
            if (index < 0 || !validAmount(amount) || !Double.isFinite(balances[index] + amount)) return false;
            balances[index] += amount;
            return true;
        }

        public boolean withdraw(String name, double amount) {
            int index = findIndexByName(name);
            if (index < 0 || !validAmount(amount) || amount > balances[index]) return false;
            balances[index] -= amount;
            return true;
        }

        public boolean transfer(String from, String to, double amount) {
            return transferToBank(from, this, to, amount);
        }

        public boolean transferToBank(String from, Bank toBank, String to, double amount) {
            if (toBank == null || !validAmount(amount)) return false;
            int sender = findIndexByName(from);
            int recipient = toBank.findIndexByName(to);
            if (sender < 0 || recipient < 0 || (toBank == this && sender == recipient)) return false;
            if (amount > balances[sender] || !Double.isFinite(toBank.balances[recipient] + amount)) return false;
            balances[sender] -= amount;
            toBank.balances[recipient] += amount;
            return true;
        }

        private static boolean validAmount(double amount) {
            return Double.isFinite(amount) && amount > 0;
        }

		public void display(String name ) {


				if (findIndexByName(name)!=-1) {
					int i=findIndexByName(name);
					System.out.println(names[i]+" "+balances[i]+" SR");
				}
				else System.out.println("Not found");
		}



		public String  findMax() {
			double	MaxBal = -1;
			int  rich=-1;
			for(int i=0; i<nClients;i++) {

				if(MaxBal<balances[i]) {
					MaxBal=balances[i];
					 rich=i;
				    }
			     }
			if (MaxBal!=-1) {
				return names[rich];
			}
				return null;
		}



 }
