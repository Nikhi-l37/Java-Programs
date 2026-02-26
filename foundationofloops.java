// Reversing a string using charAt
String s = "Java";
String reversed = "";
for (int i = s.length() - 1; i >= 0; i--) {
    reversed += s.charAt(i);
}
// Output: "avaJ"
