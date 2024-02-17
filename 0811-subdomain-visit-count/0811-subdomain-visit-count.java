class Solution {
    HashMap<String, Integer> hm= new HashMap<>();
    
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> result= new ArrayList<>();
		
        for(String s: cpdomains){
            addToList(s);
        }
        
        for(String s: hm.keySet()){
            StringBuilder sb= new StringBuilder( Integer.toString(hm.get(s)) );
            sb.append(" ");
            sb.append( s );
            result.add( sb.toString() );
        }
        return result;
    }
    
    public void addToList(String s){
        String[] split1= s.split(" ");
        int n= Integer.parseInt(split1[0]);
        String[] split2= split1[1].split("\\.");
        int l= split2.length;
        
        for(int i=0; i<l; i++){
            StringBuilder sb= new StringBuilder();
            int index= i;
            
            while(index < l){
                sb.append( split2[index] );
				
                if(index != l-1)
                    sb.append( "." );
                index++;
            }
            String str= sb.toString();
            hm.put( str, hm.getOrDefault( str, 0 )+n);
        }
    }
}