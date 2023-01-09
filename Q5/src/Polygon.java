public class Polygon {
		int x[];
		int y[];
		
		Polygon() {
			this.x = new int[3];
			this.y = new int[3];
			for(int i=0; i<3; i++) {
				this.x[i] = i;
				this.y[i] = i;
			}
		}
		
		Polygon(int x[],int y[]){
			this.x = new int[x.length];
			this.y = new int[y.length];
			for(int i=0; i<x.length; i++) {
				this.x[i] = x[i];
			}
			for(int i=0; i<y.length; i++) {
				this.y[i] = y[i];
			}
		}
		
		public boolean equals() {
			for(int i=0; i<this.x.length; i++) {
				if(this.x[i] != this.y[i]) {
					return false;
				}
			}
			return true;
		}
		
	}