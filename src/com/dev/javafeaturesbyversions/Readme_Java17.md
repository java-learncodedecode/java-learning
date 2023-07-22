#2020

#1. 2.1. Restore Always-Strict Floating-Point Semantics (JEP 306)
This JEP is mainly for scientific applications, and it makes floating-point operations consistently strict. The default floating-point operations are strict or strictfp, both of which guarantee the same results from the floating-point calculations on every platform.
Before Java 1.2, strictfp behavior was the default one as well. However, because of hardware issues, the architects changed, and the keyword strictfp was necessary to re-enable such behavior. So, there is no need to use this keyword anymore.

#2. Enhanced Pseudo-Random Number Generators (JEP 356)
Also related to more special use cases, JEP 356 provides new interfaces and implementations for Pseudo-Random Number Generators (PRNG).
So, it's easier to use different algorithms interchangeably, and it also offers better support for stream-based programming:

	public IntStream getPseudoInts(String algorithm, int streamSize) {
    // returns an IntStream with size @streamSize of random numbers generated using the @algorithm
    // where the lower bound is 0 and the upper is 100 (exclusive)
    return RandomGeneratorFactory.of(algorithm)
            .create()
            .ints(streamSize, 0,100);
	}
Legacy random classes, such as java.util.Random, SplittableRandom and SecureRandom now extend the new RandomGenerator interface.

#3. Deprecate the Applet API for Removal (JEP 398)
Although this may be sad for many Java developers who started their development career using Applet APIs, many web browsers have already removed their support for Java plugins. As the API became irrelevant, this version marked it for removal even though it has been marked as deprecated since version 9.

#4. Strongly Encapsulate JDK Internals (JEP 403)
JEP 403 represents one more step toward strongly encapsulating JDK internals since it removes the flag –illegal-access. The platform will ignore the flag, and if the flag is present, the console will issue a message informing the discontinuation of the flag.
This feature will prevent JDK users from accessing internal APIs, except for critical ones like sun.misc.Unsafe.

#5. Pattern Matching for Switch (Preview) (JEP 406)
This is another step toward pattern matching by enhancing pattern matching for switch expressions and statements. It reduces the boilerplate necessary to define those expressions and improves the expressiveness of the language.

Let's see two examples of the new capabilities:

	static record Human (String name, int age, String profession) {}

	public String checkObject(Object obj) {
    return switch (obj) {
        case Human h -> "Name: %s, age: %s and profession: %s".formatted(h.name(), h.age(), h.profession());
        case Circle c -> "This is a circle";
        case Shape s -> "It is just a shape";
        case null -> "It is null";
        default -> "It is an object";
    };
	}

	public String checkShape(Shape shape) {
    return switch (shape) {
        case Triangle t && (t.getNumberOfSides() != 3) -> "This is a weird triangle";
        case Circle c && (c.getNumberOfSides() != 0) -> "This is a weird circle";
        default -> "Just a normal shape";
    };
	}