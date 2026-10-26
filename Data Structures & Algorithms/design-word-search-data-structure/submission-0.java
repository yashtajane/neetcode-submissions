class WordDictionary {

    List<String> c ;

    public WordDictionary() {
        c=new ArrayList<>();

    }

    public void addWord(String word) {
         c.add(word);
    }

    public boolean search(String word) {
           for(String w : c){
             if(w.length()!=word.length()) continue;
             int i = 0 ;
             while(i<w.length()){
                if(w.charAt(i)==word.charAt(i) ||  word.charAt(i) == '.' ) 
                // word.charAt(i).add('.');
                i++;
                else break ;
                if(i==word.length()) return true ;
             }
           }
           
           return false;
    }
}
