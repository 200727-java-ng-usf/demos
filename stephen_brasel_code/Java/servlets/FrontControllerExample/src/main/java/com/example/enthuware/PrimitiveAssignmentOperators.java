package com.example.enthuware;

public class PrimitiveAssignmentOperators {
	boolean b = false;
	Boolean B = false;
	char c = 'c';
	Character C = 'C';
	String str = "Str";
	short s = 1;
	Short S = 1;
	byte by = 2;
	Byte By = 2;
	int i = 3;
	Integer I = 3;
	long l = 4;
	Long L = 4L;
	float f = 1.0f;
	Float F = 1.0F;
	double d = 2.0d;
	Double D = 2.0D;

	public void testboolean(boolean x){
		x = b;
		x = B;

		x = !b;
		x = !B;

		x &= b;
		x &= B;

		x |= b;
		x |= B;

		x ^= b;
		x ^= B;
	}

	public void testboolean(Boolean x){
		x = b;
		x = B;

		x = !b;
		x = !B;

		x &= b;
		x &= B;

		x |= b;
		x |= B;

		x ^= b;
		x ^= B;
	}

	public void testboolean(char x){
		x = c;
		x = C;

		x += c;
		x += C;
		x += s;
		x += S;
		x += by;
		x += By;
		x += i;
		x += I;
		x += l;
		x += L;
		x += f;
		x += F;
		x += D;
		x += d;

		x -= c;
		x -= C;
		x -= s;
		x -= S;
		x -= by;
		x -= By;
		x -= i;
		x -= I;
		x -= l;
		x -= L;
		x -= f;
		x -= F;
		x -= D;
		x -= d;

		x *= c;
		x *= C;
		x *= s;
		x *= S;
		x *= by;
		x *= By;
		x *= i;
		x *= I;
		x *= l;
		x *= L;
		x *= f;
		x *= F;
		x *= D;
		x *= d;

		x /= c;
		x /= C;
		x /= s;
		x /= S;
		x /= by;
		x /= By;
		x /= i;
		x /= I;
		x /= l;
		x /= L;
		x /= f;
		x /= F;
		x /= D;
		x /= d;

		x %= c;
		x %= C;
		x %= s;
		x %= S;
		x %= by;
		x %= By;
		x %= i;
		x %= I;
		x %= l;
		x %= L;
		x %= f;
		x %= F;
		x %= D;
		x %= d;


		x &= c;
		x &= C;
		x &= s;
		x &= S;
		x &= by;
		x &= By;
		x &= i;
		x &= I;
		x &= l;
		x &= L;

		x |= c;
		x |= C;
		x |= s;
		x |= S;
		x |= by;
		x |= By;
		x |= i;
		x |= I;
		x |= l;
		x |= L;

		x ^= c;
		x ^= C;
		x ^= s;
		x ^= S;
		x ^= by;
		x ^= By;
		x ^= i;
		x ^= I;
		x ^= l;
		x ^= L;
	}

	public void testboolean(Character x){
		x = c;
		x = C;
	}

	public void testboolean(String x){
		x = str;

		x += b;
		x += B;
		x += c;
		x += C;
		x += str;
		x += s;
		x += S;
		x += by;
		x += By;
		x += i;
		x += I;
		x += l;
		x += L;
		x += f;
		x += F;
		x += D;
		x += d;
	}

	public void testboolean(short x){
		x = s;
		x = S;
		x = by;
		x = By;

		x += c;
		x += C;
		x += s;
		x += S;
		x += by;
		x += By;
		x += i;
		x += I;
		x += l;
		x += L;
		x += f;
		x += F;
		x += D;
		x += d;

		x -= c;
		x -= C;
		x -= s;
		x -= S;
		x -= by;
		x -= By;
		x -= i;
		x -= I;
		x -= l;
		x -= L;
		x -= f;
		x -= F;
		x -= D;
		x -= d;

		x *= c;
		x *= C;
		x *= s;
		x *= S;
		x *= by;
		x *= By;
		x *= i;
		x *= I;
		x *= l;
		x *= L;
		x *= f;
		x *= F;
		x *= D;
		x *= d;

		x /= c;
		x /= C;
		x /= s;
		x /= S;
		x /= by;
		x /= By;
		x /= i;
		x /= I;
		x /= l;
		x /= L;
		x /= f;
		x /= F;
		x /= D;
		x /= d;

		x %= c;
		x %= C;
		x %= s;
		x %= S;
		x %= by;
		x %= By;
		x %= i;
		x %= I;
		x %= l;
		x %= L;
		x %= f;
		x %= F;
		x %= D;
		x %= d;


		x &= c;
		x &= C;
		x &= s;
		x &= S;
		x &= by;
		x &= By;
		x &= i;
		x &= I;
		x &= l;
		x &= L;

		x |= c;
		x |= C;
		x |= s;
		x |= S;
		x |= by;
		x |= By;
		x |= i;
		x |= I;
		x |= l;
		x |= L;

		x ^= c;
		x ^= C;
		x ^= s;
		x ^= S;
		x ^= by;
		x ^= By;
		x ^= i;
		x ^= I;
		x ^= l;
		x ^= L;
	}

	public void testboolean(Short x){
		x = s;
		x = S;
	}

	public void testboolean(byte x){
		x = by;
		x = By;

		x += c;
		x += C;
		x += s;
		x += S;
		x += by;
		x += By;
		x += i;
		x += I;
		x += l;
		x += L;
		x += f;
		x += F;
		x += D;
		x += d;

		x -= c;
		x -= C;
		x -= s;
		x -= S;
		x -= by;
		x -= By;
		x -= i;
		x -= I;
		x -= l;
		x -= L;
		x -= f;
		x -= F;
		x -= D;
		x -= d;

		x *= c;
		x *= C;
		x *= s;
		x *= S;
		x *= by;
		x *= By;
		x *= i;
		x *= I;
		x *= l;
		x *= L;
		x *= f;
		x *= F;
		x *= D;
		x *= d;

		x /= c;
		x /= C;
		x /= s;
		x /= S;
		x /= by;
		x /= By;
		x /= i;
		x /= I;
		x /= l;
		x /= L;
		x /= f;
		x /= F;
		x /= D;
		x /= d;

		x %= c;
		x %= C;
		x %= s;
		x %= S;
		x %= by;
		x %= By;
		x %= i;
		x %= I;
		x %= l;
		x %= L;
		x %= f;
		x %= F;
		x %= D;
		x %= d;


		x &= c;
		x &= C;
		x &= s;
		x &= S;
		x &= by;
		x &= By;
		x &= i;
		x &= I;
		x &= l;
		x &= L;

		x |= c;
		x |= C;
		x |= s;
		x |= S;
		x |= by;
		x |= By;
		x |= i;
		x |= I;
		x |= l;
		x |= L;

		x ^= c;
		x ^= C;
		x ^= s;
		x ^= S;
		x ^= by;
		x ^= By;
		x ^= i;
		x ^= I;
		x ^= l;
		x ^= L;
	}

	public void testboolean(Byte x){
		x = by;
		x = By;
	}

	public void testboolean(int x){
		x = c;
		x = C;
		x = s;
		x = S;
		x = by;
		x = By;
		x = i;
		x = I;

		x += c;
		x += C;
		x += s;
		x += S;
		x += by;
		x += By;
		x += i;
		x += I;
		x += l;
		x += L;
		x += f;
		x += F;
		x += D;
		x += d;

		x -= c;
		x -= C;
		x -= s;
		x -= S;
		x -= by;
		x -= By;
		x -= i;
		x -= I;
		x -= l;
		x -= L;
		x -= f;
		x -= F;
		x -= D;
		x -= d;

		x *= c;
		x *= C;
		x *= s;
		x *= S;
		x *= by;
		x *= By;
		x *= i;
		x *= I;
		x *= l;
		x *= L;
		x *= f;
		x *= F;
		x *= D;
		x *= d;

		x /= c;
		x /= C;
		x /= s;
		x /= S;
		x /= by;
		x /= By;
		x /= i;
		x /= I;
		x /= l;
		x /= L;
		x /= f;
		x /= F;
		x /= D;
		x /= d;

		x %= c;
		x %= C;
		x %= s;
		x %= S;
		x %= by;
		x %= By;
		x %= i;
		x %= I;
		x %= l;
		x %= L;
		x %= f;
		x %= F;
		x %= D;
		x %= d;


		x &= c;
		x &= C;
		x &= s;
		x &= S;
		x &= by;
		x &= By;
		x &= i;
		x &= I;
		x &= l;
		x &= L;

		x |= c;
		x |= C;
		x |= s;
		x |= S;
		x |= by;
		x |= By;
		x |= i;
		x |= I;
		x |= l;
		x |= L;

		x ^= c;
		x ^= C;
		x ^= s;
		x ^= S;
		x ^= by;
		x ^= By;
		x ^= i;
		x ^= I;
		x ^= l;
		x ^= L;
	}

	public void testboolean(Integer x){
		x = i;
		x = I;

		x += c;
		x += C;
		x += s;
		x += S;
		x += by;
		x += By;
		x += i;
		x += I;

		x -= c;
		x -= C;
		x -= s;
		x -= S;
		x -= by;
		x -= By;
		x -= i;
		x -= I;

		x *= c;
		x *= C;
		x *= s;
		x *= S;
		x *= by;
		x *= By;
		x *= i;
		x *= I;

		x /= c;
		x /= C;
		x /= s;
		x /= S;
		x /= by;
		x /= By;
		x /= i;
		x /= I;

		x %= c;
		x %= C;
		x %= s;
		x %= S;
		x %= by;
		x %= By;
		x %= i;
		x %= I;


		x &= c;
		x &= C;
		x &= s;
		x &= S;
		x &= by;
		x &= By;
		x &= i;
		x &= I;

		x |= c;
		x |= C;
		x |= s;
		x |= S;
		x |= by;
		x |= By;
		x |= i;
		x |= I;

		x ^= c;
		x ^= C;
		x ^= s;
		x ^= S;
		x ^= by;
		x ^= By;
		x ^= i;
		x ^= I;
	}

	public void testboolean(long x){
		x = c;
		x = C;
		x = s;
		x = S;
		x = by;
		x = By;
		x = i;
		x = I;
		x = l;
		x = L;

		x += c;
		x += C;
		x += s;
		x += S;
		x += by;
		x += By;
		x += i;
		x += I;
		x += l;
		x += L;
		x += f;
		x += F;
		x += D;
		x += d;

		x -= c;
		x -= C;
		x -= s;
		x -= S;
		x -= by;
		x -= By;
		x -= i;
		x -= I;
		x -= l;
		x -= L;
		x -= f;
		x -= F;
		x -= D;
		x -= d;

		x *= c;
		x *= C;
		x *= s;
		x *= S;
		x *= by;
		x *= By;
		x *= i;
		x *= I;
		x *= l;
		x *= L;
		x *= f;
		x *= F;
		x *= D;
		x *= d;

		x /= c;
		x /= C;
		x /= s;
		x /= S;
		x /= by;
		x /= By;
		x /= i;
		x /= I;
		x /= l;
		x /= L;
		x /= f;
		x /= F;
		x /= D;
		x /= d;

		x %= c;
		x %= C;
		x %= s;
		x %= S;
		x %= by;
		x %= By;
		x %= i;
		x %= I;
		x %= l;
		x %= L;
		x %= f;
		x %= F;
		x %= D;
		x %= d;


		x &= c;
		x &= C;
		x &= s;
		x &= S;
		x &= by;
		x &= By;
		x &= i;
		x &= I;
		x &= l;
		x &= L;

		x |= c;
		x |= C;
		x |= s;
		x |= S;
		x |= by;
		x |= By;
		x |= i;
		x |= I;
		x |= l;
		x |= L;

		x ^= c;
		x ^= C;
		x ^= s;
		x ^= S;
		x ^= by;
		x ^= By;
		x ^= i;
		x ^= I;
		x ^= l;
		x ^= L;
	}

	public void testboolean(Long x){
		x = l;
		x = L;

		x += c;
		x += C;
		x += s;
		x += S;
		x += by;
		x += By;
		x += i;
		x += I;
		x += l;
		x += L;

		x -= c;
		x -= C;
		x -= s;
		x -= S;
		x -= by;
		x -= By;
		x -= i;
		x -= I;
		x -= l;
		x -= L;

		x *= c;
		x *= C;
		x *= s;
		x *= S;
		x *= by;
		x *= By;
		x *= i;
		x *= I;
		x *= l;
		x *= L;

		x /= c;
		x /= C;
		x /= s;
		x /= S;
		x /= by;
		x /= By;
		x /= i;
		x /= I;
		x /= l;
		x /= L;

		x %= c;
		x %= C;
		x %= s;
		x %= S;
		x %= by;
		x %= By;
		x %= i;
		x %= I;
		x %= l;
		x %= L;


		x &= c;
		x &= C;
		x &= s;
		x &= S;
		x &= by;
		x &= By;
		x &= i;
		x &= I;
		x &= l;
		x &= L;

		x |= c;
		x |= C;
		x |= s;
		x |= S;
		x |= by;
		x |= By;
		x |= i;
		x |= I;
		x |= l;
		x |= L;

		x ^= c;
		x ^= C;
		x ^= s;
		x ^= S;
		x ^= by;
		x ^= By;
		x ^= i;
		x ^= I;
		x ^= l;
		x ^= L;
	}

	public void testboolean(float x){
		x = c;
		x = C;
		x = s;
		x = S;
		x = by;
		x = By;
		x = i;
		x = I;
		x = l;
		x = L;
		x = f;
		x = F;

		x += c;
		x += C;
		x += s;
		x += S;
		x += by;
		x += By;
		x += i;
		x += I;
		x += l;
		x += L;
		x += f;
		x += F;
		x += D;
		x += d;

		x -= c;
		x -= C;
		x -= s;
		x -= S;
		x -= by;
		x -= By;
		x -= i;
		x -= I;
		x -= l;
		x -= L;
		x -= f;
		x -= F;
		x -= D;
		x -= d;

		x *= c;
		x *= C;
		x *= s;
		x *= S;
		x *= by;
		x *= By;
		x *= i;
		x *= I;
		x *= l;
		x *= L;
		x *= f;
		x *= F;
		x *= D;
		x *= d;

		x /= c;
		x /= C;
		x /= s;
		x /= S;
		x /= by;
		x /= By;
		x /= i;
		x /= I;
		x /= l;
		x /= L;
		x /= f;
		x /= F;
		x /= D;
		x /= d;

		x %= c;
		x %= C;
		x %= s;
		x %= S;
		x %= by;
		x %= By;
		x %= i;
		x %= I;
		x %= l;
		x %= L;
		x %= f;
		x %= F;
		x %= D;
		x %= d;
	}

	public void testboolean(Float x){
		x = f;
		x = F;

		x += c;
		x += C;
		x += s;
		x += S;
		x += by;
		x += By;
		x += i;
		x += I;
		x += l;
		x += L;
		x += f;
		x += F;

		x -= c;
		x -= C;
		x -= s;
		x -= S;
		x -= by;
		x -= By;
		x -= i;
		x -= I;
		x -= l;
		x -= L;
		x -= f;
		x -= F;

		x *= c;
		x *= C;
		x *= s;
		x *= S;
		x *= by;
		x *= By;
		x *= i;
		x *= I;
		x *= l;
		x *= L;
		x *= f;
		x *= F;

		x /= c;
		x /= C;
		x /= s;
		x /= S;
		x /= by;
		x /= By;
		x /= i;
		x /= I;
		x /= l;
		x /= L;
		x /= f;
		x /= F;

		x %= c;
		x %= C;
		x %= s;
		x %= S;
		x %= by;
		x %= By;
		x %= i;
		x %= I;
		x %= l;
		x %= L;
		x %= f;
		x %= F;
	}

	public void testboolean(double x){
		x = c;
		x = C;
		x = s;
		x = S;
		x = by;
		x = By;
		x = i;
		x = I;
		x = l;
		x = L;
		x = f;
		x = F;
		x = D;
		x = d;

		x += c;
		x += C;
		x += s;
		x += S;
		x += by;
		x += By;
		x += i;
		x += I;
		x += l;
		x += L;
		x += f;
		x += F;
		x += D;
		x += d;

		x -= c;
		x -= C;
		x -= s;
		x -= S;
		x -= by;
		x -= By;
		x -= i;
		x -= I;
		x -= l;
		x -= L;
		x -= f;
		x -= F;
		x -= D;
		x -= d;

		x *= c;
		x *= C;
		x *= s;
		x *= S;
		x *= by;
		x *= By;
		x *= i;
		x *= I;
		x *= l;
		x *= L;
		x *= f;
		x *= F;
		x *= D;
		x *= d;

		x /= c;
		x /= C;
		x /= s;
		x /= S;
		x /= by;
		x /= By;
		x /= i;
		x /= I;
		x /= l;
		x /= L;
		x /= f;
		x /= F;
		x /= D;
		x /= d;

		x %= c;
		x %= C;
		x %= s;
		x %= S;
		x %= by;
		x %= By;
		x %= i;
		x %= I;
		x %= l;
		x %= L;
		x %= f;
		x %= F;
		x %= D;
		x %= d;
	}

	public void testboolean(Double x){
		x = D;
		x = d;

		x += c;
		x += C;
		x += s;
		x += S;
		x += by;
		x += By;
		x += i;
		x += I;
		x += l;
		x += L;
		x += f;
		x += F;
		x += D;
		x += d;

		x -= c;
		x -= C;
		x -= s;
		x -= S;
		x -= by;
		x -= By;
		x -= i;
		x -= I;
		x -= l;
		x -= L;
		x -= f;
		x -= F;
		x -= D;
		x -= d;

		x *= c;
		x *= C;
		x *= s;
		x *= S;
		x *= by;
		x *= By;
		x *= i;
		x *= I;
		x *= l;
		x *= L;
		x *= f;
		x *= F;
		x *= D;
		x *= d;

		x /= c;
		x /= C;
		x /= s;
		x /= S;
		x /= by;
		x /= By;
		x /= i;
		x /= I;
		x /= l;
		x /= L;
		x /= f;
		x /= F;
		x /= D;
		x /= d;

		x %= c;
		x %= C;
		x %= s;
		x %= S;
		x %= by;
		x %= By;
		x %= i;
		x %= I;
		x %= l;
		x %= L;
		x %= f;
		x %= F;
		x %= D;
		x %= d;
	}
}
