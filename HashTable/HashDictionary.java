
public class HashDictionary {
	private KVpair[] table;
	private int buckets;
	private int records;
	
	public HashDictionary(int n) {
		buckets = n;
		records = 0;
		table = new KVpair[n];
	}
	
	public void clear() {
		for(int i = 0; i < buckets; i++) {
			table[i] = null;
		}
		records = 0;
	}
	
	public void insert(int k, int value) {
		int num = hash(k);
		
		while(!(table[num] == null)) {
			num++;				//linear probing
			num = num % buckets;	//wrap around the table
		}
		
		table[num] = new KVpair(k, value);
		records++;
	}
	
	public int hash(int k) {
		return k % 13;
	}
	
	public void print() {
		for(int i = 0; i < buckets; i++) {
			if(table[i] == null)
				System.out.print("-" + " ");
			else
				System.out.print(table[i].key() + " ");
		}
		System.out.println();
		System.out.println("Numbers of records: " + records);
	}
}
