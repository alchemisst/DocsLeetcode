class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> container = new HashSet<>();
        for(int i:nums){
            if(container.contains(i)){
                return true;
            }
            else{
                container.add(i);
            }
        }
        return false;
    }
}