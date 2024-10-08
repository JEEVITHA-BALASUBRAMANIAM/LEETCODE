class Solution {
   public List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> result=new ArrayList<>();
    HashMap<String,List<String>> map=new HashMap<>();
    for(String s:strs){
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        String str=new String(ch);
        if(!map.containsKey(str)){
            map.put(str,new ArrayList<>());
        }
        map.get(str).add(s);
    }
    return new ArrayList<>(map.values());
  }
}

// map          
//key      values

//aet      [eat,tea,ate]
//ant      [tan,nat]
//abt      [bat]






































// import java.util.Arrays;
// class Solution {
//     public boolean isAnagram(String a,String b){
//         if(a.length()!=b.length())
//          return false;
//         char a1[]=a.toCharArray();
//         char b1[]=b.toCharArray();
//         Arrays.sort(a1);
//         Arrays.sort(b1);
//         String s1=new String(a1);
//         String s2=new String(b1);
//         if(s1.equals(s2))
//          return true;
//         else
//          return false;   
//     }
//     public List<List<String>> groupAnagrams(String[] strs) {
//        List<List<String>> res =new ArrayList<>();
//        List<String>l=new ArrayList<>();

//        if(strs.length==0){
//         l.add("");
//          res.add(l);
//          return res;
//        }
//        if(strs.length==1)
//        {
//         l.add(strs[0]);
//         res.add(l);
//         return res;
//        }
//        int n=strs.length;
//        int arr[]=new int[n];
//        for(int i=0;i<n;i++){
//          List<String> li=new ArrayList<>();
//           int c=0;
//         for(int j=i+1;j<n;j++){
           
//            if(isAnagram(strs[i],strs[j])){
//             c=1;
//             if(arr[i]==0)
//              { li.add(strs[i]);
               
//              }
//              if(arr[j]==0){
//                 li.add(strs[j]);
//              }
//             arr[i]=1;
//             arr[j]=1;
//            }              
//         }
//          if(c==0){
//             if(arr[i]==0)
//               li.add(strs[i]);
//            }
//            if(!li.isEmpty())
//              res.add(li);
//        }
//        return res;
//     }
// }
