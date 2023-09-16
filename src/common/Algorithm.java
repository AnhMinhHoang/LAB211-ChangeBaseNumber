/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

/**
 *
 * @author GoldCandy
 */
public class Algorithm {
    public int binToDeci(String bin){
        int a;
        int power = 0;
        int sum = 0;
        for(int i = bin.length()-1; i >= 0; i--){
            a = bin.charAt(i) - '0';
            sum+= (a * Math.pow(2, power));
            power++;
        }
        return sum;
    }
    
    public String binToHexa(String bin){
        String sum = "";
        int sumDeci;
        String temp = "";
        for(int i = bin.length() - 1; i >= 0; i--){
            if(temp.length() < 4){
                temp += bin.charAt(i);
            }
            if (temp.length() == 4 || i == 0){
                temp = reverseString(temp);
                sumDeci = binToDeci(temp);
                if(sumDeci < 10){
                    sum+=sumDeci;
                }
                else{
                    sum+=convertHexaNumber(sumDeci);
                }
                temp = "";
            }
        }
        sum = reverseString(sum);
        return sum;
    }
    
    public String deciToBin(int deci){
        String sum = "";
        while(true){
            sum += deci%2;
            deci = deci/2;
            if(deci/2 == 0){
                if(deci%2!=0){
                    sum+=deci%2;
                }
                break;
            }
        }
        sum = reverseString(sum);
        return sum;
    }
    
    public String deciToHexa(int deci){
        String sum = "";
        int remainder;
        while(true){
            remainder = deci%16;
            if(remainder < 10){
                sum += remainder;
            }
            else{
                sum+= convertHexaNumber(remainder);
            }
            deci = deci/16;
            if(deci/16 == 0){
                if(deci%16!=0){
                    sum+=deci%16;
                }
                break;
            }
        }
        sum = reverseString(sum);
        return sum;
    }
    
    public String hexaToBin(String hexa){
        String sum = "";
        String test;
        for(int i = 0; i < hexa.length(); i++){
            if((int)hexa.charAt(i)-'0' < 10){
                test = deciToBin(hexa.charAt(i)-'0');
                while(test.length()!=4){
                    test = "0".concat(test);
                }
                sum+= test;
            }
            else{
                sum += deciToBin(convertHexaWord(hexa.charAt(i)));
            }
        }
        return sum;
    }
    
    public int hexaToDeci(String hexa){
        int sum = 0;
        int power = 0;
        int temp;
        for(int i = hexa.length()-1; i >=0; i--){
            if((int)hexa.charAt(i)-'0' < 10){
                temp = hexa.charAt(i) - '0';
            }
            else{
                temp = convertHexaWord(hexa.charAt(i));
            }
            sum+=temp * Math.pow(16, power);
            power++;
        }
        return sum;
    }
    
    public char convertHexaNumber(int num){
        return (char)(num+55);
    }
    
    public int convertHexaWord(char s){
        return (int)(s-55);
    }
    
    public String reverseString(String s){
        String result = "";
        for(int i = s.length()-1; i>=0; i--){
            result+=s.charAt(i);
        }
        return result;
    }
}
