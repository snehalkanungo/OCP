//Singleton 
public class DesignPattern1 {

	
	private DesignPattern1(){
		
	}	
		private static DesignPattern1 ds;
		/*static{
			ds = new DesignPattern1();
		}*/
		
		//Lazy instantiation
		public static DesignPattern1 getInstance(){
			if(ds == null){
				synchronized(DesignPattern1.class){
					if(ds == null)
						ds = new DesignPattern1();
				}
			}
			return ds;
		}

}
