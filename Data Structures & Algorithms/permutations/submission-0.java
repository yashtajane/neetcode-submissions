class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> perms = new ArrayList<>();
        perms.add(new ArrayList<>());

        for(int n : nums){

             List<List<Integer>>new_perms = new ArrayList<>();
            
            for(List<Integer> p: perms){

                // List<List<Integer>>new_perms = new ArrayList<>();

                  for(int i=0 ; i<=p.size() ; i++){
                     List<Integer> p_c = new ArrayList<>(p);
                     p_c.add(i,n);
                     new_perms.add(p_c);
                  }

                  perms=new_perms;
            }

            perms=new_perms;
            
        }
        return perms;
    }
}
