/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progtpsit;

import java.io.UnsupportedEncodingException;

/** Classe di utilità per la codifica di moduli HTML. Questa classe contiene metodi statici per convertire una stringa nel application/x-www-form-urlencodedformato MIME. Per ulteriori informazioni sulla codifica dei moduli HTML, consultare la specifica HTML .
Quando si codifica una stringa, si applicano le seguenti regole:
* <ul> 
* <li>I caratteri alfanumerici da " a" a " z", " A" a " Z" e " 0" a " 9" rimangono gli stessi. </li>
* <li>I caratteri speciali " .", " -", " *" e " _" rimangono gli stessi </li>
* <li>Il carattere spazio "  " viene convertito in un segno più " +". </li>
* <li> Tutti gli altri caratteri non sono sicuri e vengono prima convertiti in uno o più byte utilizzando uno schema di codifica. Quindi ogni byte è rappresentato dalla stringa di 3 caratteri " ", dove xy è la rappresentazione esadecimale a due cifre del byte. Lo schema di codifica consigliato da utilizzare è UTF-8. Tuttavia, per motivi di compatibilità, se non viene specificata una codifica, viene utilizzata la codifica predefinita della piattaforma. %xy </li>
* </ul>
*/
public class URLEncoder {
    public URLEncoder(String s){
     
 }  
    /** 
     * Deprecato.  La stringa risultante può variare a seconda della codifica predefinita della piattaforma. Utilizzare invece il metodo encode (String, String) per specificare la codifica.
Traduce una stringa in x-www-form-urlencoded formato. Questo metodo utilizza la codifica predefinita della piattaforma come schema di codifica per ottenere i byte per i caratteri non sicuri.
     * @param s  -Stringa da tradurre
     * @return  -Stringa tradotta
     */
    public static  String  encode ( String  s){
        return s;
    }
    /**
     * Translates a string into application/x-www-form-urlencoded format using a specific encoding scheme. This method uses the supplied encoding scheme to obtain the bytes for unsafe characters.
Note: The World Wide Web Consortium Recommendation states that UTF-8 should be used. Not doing so may introduce incompatibilites.
     * @param s - la stringa è stata tradotta
     * @param enc - il nome è supportato dal carattere
     * @return  -the translated String
     * @throws UnsupportedEncodingException If the named encoding is not supported
     * @since 1.4
     */
    public static String encode(String s,String enc) throws UnsupportedEncodingException{
        return s;
    }
}