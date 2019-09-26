import std.stdio;
import std.random;
import std.ascii;

//cerner_2^5_2019
void main() {
	Random rnd = Random(115529661);
	foreach (i; 0 .. 6)
	   write(letters[uniform(0, 26, rnd)]);
	writeln();
}