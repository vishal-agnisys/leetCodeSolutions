// LC Q:- 1108
class Solution {
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.","[.]");
    }

}