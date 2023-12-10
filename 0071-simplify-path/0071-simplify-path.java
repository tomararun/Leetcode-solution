public class Solution {
    public String simplifyPath(String path) {
        //paso#1
        String[] palabras = path.split("/");
 
        //paso#2
        List<String> respuesta = new ArrayList<>();
 
        //paso#3
        for (String palabra : palabras) {
            //paso#3.1
            if (palabra.equals("..")) {
                if (!respuesta.isEmpty())  
                    respuesta.remove(respuesta.size() - 1);
                continue;
            }
 
             //paso#3.2
            if (!palabra.equals("") && !palabra.equals(".")) {
                respuesta.add(palabra);
            }
        }
 
        //paso#4
        return "/" + String.join("/", respuesta);
    }
}