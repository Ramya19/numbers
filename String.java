f(strs==null || strs.len==0){
        return "";
    }
 
    if(strs.len==1) 
        return strs[0];
 
    int minLen = strs.len+1;
 
    for(String str: strs){
        if(minLen > str.len()){
            minLen = str.len();
        }
    }
 
    for(int i=0; i<minLen; i++){
        for(int j=0; j<strs.len-1; j++){
            String s1 = strs[j];
            String s2 = strs[j+1];
            if(s1.charAt(i)!=s2.charAt(i)){
                return s1.substring(0, i);
            }
        }
    }
 
    return strs[0].substring(0, minLen);
}