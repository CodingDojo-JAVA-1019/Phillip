public class StringManipulator{
    
    public String trimAndConcat(String str, String str2){
        String a=str.trim()+str2.trim();
        return a;
    }

    public Integer getIndexOrNull(String str, char ch){
        int a = str.indexOf(ch);
        if (a != -1){
        return a;
        }
        else{
            return null;
        }
    }

    public Integer getIndexOrNull(String str, String sub){
        int a = str.indexOf(sub);
        if (a != -1){
            return a;
            }
            else{
                return null;
        }
    }

    public String concatSubString(String str, int a, int b, String str2 ){
        String strA= str.substring(a,b)+str2;
        return strA;

    }

}