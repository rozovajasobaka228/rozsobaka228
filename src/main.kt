import kotlin.random.Random

fun main()
{
    var a = Random.nextInt(-10,10)
    var b = Random.nextInt(-10,10)
    var c = Random.nextInt(-10,10)
    print("Число А = $a\n")
    print("Число B = $b\n")
    print("Число С = $c\n")
    var buffer = 0
    buffer = a
    print("Буфер = $buffer\n")
    a = b
    b = c
    c = buffer
    print("Число А = $a\n")
    print("Число B = $b\n")
    print("Число C = $c\n")
    print ("СдЕлАнО рОзОвОй сОбАкОй22&")
    print("гладких")
}