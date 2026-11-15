package P7;

import android.animation.FloatEvaluator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends FloatEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f4724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f4725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Number f4726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Number f4727d;

    public a(Function1 startValueProvider, Function1 endValueProvider) {
        Intrinsics.checkNotNullParameter(startValueProvider, "startValueProvider");
        Intrinsics.checkNotNullParameter(endValueProvider, "endValueProvider");
        this.f4724a = startValueProvider;
        this.f4725b = endValueProvider;
    }

    private final Number a(Number number) {
        if (this.f4727d == null) {
            this.f4727d = (Number) this.f4725b.invoke(number);
        }
        return this.f4727d;
    }

    private final Number b(Number number) {
        if (this.f4726c == null) {
            this.f4726c = (Number) this.f4724a.invoke(number);
        }
        return this.f4726c;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.animation.TypeEvaluator
    public Float evaluate(float f10, Number number, Number number2) {
        Number numberB = b(number);
        Number numberA = a(number2);
        if (numberB == null || numberA == null) {
            return null;
        }
        return super.evaluate(f10, numberB, numberA);
    }
}
