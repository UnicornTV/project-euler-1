//: my Dirty Code. Refactor later

import UIKit

var numbers = (one:"one",two:"two",three:"three", four:"four", five:"five", six:"six", seven:"seven", eight:"eight", nine:"nine", ten:"ten", eleven:"eleven", twelve:"twelve", thirteen:"thirteen", fourteen:"fourteen", fifteen:"fifteen", sixteen:"sixteen", seventeen:"seventeen", eighteen:"eighteen",nineteen:"nineteen", twenty:"twenty", thirty:"thirty", forty:"forty", fifty:"fifty", sixty:"sixty", seventy:"seventy", eighty:"eighty", ninety:"ninety", hundred:"hundred", thousand:"thousand")


var onetoNineteen = ["one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"]
var tens = ["ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"]

let hundred = "hundred"
let thousand = "thousand"


var count = 0

func countChar(temp : Int){
    switch temp {
    case 1:
        count = count + numbers.one.characters.count
        break
    case 2:
        count = count + numbers.two.characters.count
        break
    case 3:
        count = count + numbers.three.characters.count
    case 4:
        count = count + numbers.four.characters.count
    case 5:
        count = count + numbers.five.characters.count
    case 6:
        count = count + numbers.six.characters.count
    case 7:
        count = count + numbers.seven.characters.count
        break
    case 8:
        count = count + numbers.eight.characters.count
        break
    case 9:
        count = count + numbers.nine.characters.count
        break
    case 10:
        count = count + numbers.ten.characters.count
        break
    case 11:
        count = count + numbers.eleven.characters.count
        break
    case 12:
        count = count + numbers.twelve.characters.count
        break
    case 13:
        count = count + numbers.thirteen.characters.count
        break
    case 14:
        count = count + numbers.fourteen.characters.count
        break
    case 15:
        count = count + numbers.fifteen.characters.count
        break
    case 16:
        count = count + numbers.sixteen.characters.count
        break
    case 17:
        count = count + numbers.seventeen.characters.count
        break
    case 18:
        count = count + numbers.eighteen.characters.count
        break
    case 19:
        count = count + numbers.nineteen.characters.count
        break
    default:
        charCount(charCount: temp)
        break;
    }
}

func charCount(charCount: Int){
    var test = charCount
        if (test >= 20 && test < 30){
            count = count + numbers.twenty.characters.count
            test = test - 20;
            countChar(temp: test)
        }
        if (test >= 30 && test < 40){
            count = count + numbers.thirty.characters.count
            test = test - 30;
            countChar(temp: test)
        }
        if (test >= 40 && test < 50){
            count = count + numbers.forty.characters.count
            test = test - 40;
            countChar(temp: test)
        }
        if (test >= 50 && test < 60){
            count = count + numbers.fifty.characters.count
            test = test - 50;
            countChar(temp: test)
        }
        if (test >= 60 && test < 70){
            count = count + numbers.sixty.characters.count
            test = test - 60;
            countChar(temp: test)
        }
        if (test >= 70 && test < 80){
            count = count + numbers.seventy.characters.count
            test = test - 70;
            countChar(temp: test)
        }
        if (test >= 80 && test < 90){
            count = count + numbers.eighty.characters.count
            test = test - 80;
            countChar(temp: test)
        }
        if (test >= 90 && test < 100){
            count = count + numbers.ninety.characters.count
            test = test - 90;
            countChar(temp: test)
        }
        if (test >= 100 && test < 200){
            var hundred : String
            
            if( (test % 100) == 0){
                hundred = "\(numbers.one)\(numbers.hundred)"
            }else{
                hundred = "\(numbers.one)\(numbers.hundred)and"
            }
            count = count + hundred.characters.count
            test = test - 100;
            countChar(temp: test)
        }
        if (test >= 200 && test < 300){
            var hundred : String
            
            if( (test % 100) == 0){
                hundred = "\(numbers.two)\(numbers.hundred)"
            }else{
                hundred = "\(numbers.two)\(numbers.hundred)and"
            }
            count = count + hundred.characters.count
            test = test - 200;
            countChar(temp: test)
        }
        if (test >= 300 && test < 400){
            var hundred : String
            
            if( (test % 100) == 0){
                hundred = "\(numbers.three)\(numbers.hundred)"
            }else{
                hundred = "\(numbers.three)\(numbers.hundred)and"
            }
            count = count + hundred.characters.count
            test = test - 300;
            countChar(temp: test)
        }
        if (test >= 400 && test < 500){
            var hundred : String
            
            if( (test % 100) == 0){
                hundred = "\(numbers.four)\(numbers.hundred)"
            }else{
                hundred = "\(numbers.four)\(numbers.hundred)and"
            }
            count = count + hundred.characters.count
            test = test - 400;
            countChar(temp: test)
        }
        if (test >= 500 && test < 600){
            var hundred : String
            
            if( (test % 100) == 0){
                hundred = "\(numbers.five)\(numbers.hundred)"
            }else{
                hundred = "\(numbers.five)\(numbers.hundred)and"
            }
            count = count + hundred.characters.count
            test = test - 500;
            countChar(temp: test)
        }
        if (test >= 600 && test < 700){
            var hundred : String
            
            if( (test % 100) == 0){
                hundred = "\(numbers.six)\(numbers.hundred)"
            }else{
                hundred = "\(numbers.six)\(numbers.hundred)and"
            }
            count = count + hundred.characters.count
            test = test - 600;
            countChar(temp: test)
        }
        if (test >= 700 && test < 800){
            var hundred : String
            
            if( (test % 100) == 0){
                hundred = "\(numbers.seven)\(numbers.hundred)"
            }else{
                hundred = "\(numbers.seven)\(numbers.hundred)and"
            }
            count = count + hundred.characters.count
            test = test - 700;
            countChar(temp: test)
        }
        if (test >= 800 && test < 900){
            var hundred : String
            
            if( (test % 100) == 0){
                hundred = "\(numbers.eight)\(numbers.hundred)"
            }else{
                hundred = "\(numbers.eight)\(numbers.hundred)and"
            }
            count = count + hundred.characters.count
            test = test - 800;
            countChar(temp: test)
        }
        if (test >= 900 && test < 1000){
            var hundred : String
            
            if( (test % 100) == 0){
                hundred = "\(numbers.nine)\(numbers.hundred)"
            }else{
                hundred = "\(numbers.nine)\(numbers.hundred)and"
            }
            count = count + hundred.characters.count
            test = test - 900;
            countChar(temp: test)
        }
        if (test == 1000){
            var thousand : String = "\(numbers.one)\(numbers.thousand)"
            count += thousand.characters.count
        }
}

for i in stride(from: 0, to: 1001, by: 1){
//    countChar(temp: i)
    if(i < 19){
        count += onetoNineteen[i].characters.count
    }else{
        charCount(charCount: i)
    }
}

print(count)
// 21,124