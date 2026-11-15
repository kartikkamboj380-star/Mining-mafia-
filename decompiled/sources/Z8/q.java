package Z8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q {
    public static final o a(Number value, String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(output, "output");
        return new o("Unexpected special floating-point value " + value + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) h(output, 0, 1, null)));
    }

    public static final o b(V8.d keyDescriptor) {
        Intrinsics.checkNotNullParameter(keyDescriptor, "keyDescriptor");
        return new o("Value of type '" + keyDescriptor.h() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final m c(int i10, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (i10 >= 0) {
            message = "Unexpected JSON token at offset " + i10 + ": " + message;
        }
        return new m(message);
    }

    public static final m d(int i10, String message, CharSequence input) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(input, "input");
        return c(i10, message + "\nJSON input: " + ((Object) g(input, i10)));
    }

    public static final Void e(AbstractC1072a abstractC1072a, String entity) {
        Intrinsics.checkNotNullParameter(abstractC1072a, "<this>");
        Intrinsics.checkNotNullParameter(entity, "entity");
        abstractC1072a.u("Trailing comma before the end of JSON " + entity, abstractC1072a.f7184a - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw new p129m8.d();
    }

    public static /* synthetic */ Void f(AbstractC1072a abstractC1072a, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "object";
        }
        return e(abstractC1072a, str);
    }

    public static final CharSequence g(CharSequence charSequence, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i10 != -1) {
                int i11 = i10 - 30;
                int i12 = i10 + 30;
                return (i11 <= 0 ? "" : ".....") + charSequence.subSequence(kotlin.ranges.b.c(i11, 0), kotlin.ranges.b.g(i12, charSequence.length())).toString() + (i12 >= charSequence.length() ? "" : ".....");
            }
            int length = charSequence.length() - 60;
            if (length > 0) {
                return "....." + charSequence.subSequence(length, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static /* synthetic */ CharSequence h(CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -1;
        }
        return g(charSequence, i10);
    }

    public static final Void i(AbstractC1072a abstractC1072a, Number result) {
        Intrinsics.checkNotNullParameter(abstractC1072a, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        AbstractC1072a.v(abstractC1072a, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
        throw new p129m8.d();
    }
}
