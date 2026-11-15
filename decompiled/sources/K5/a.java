package K5;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f2778a;

    public a(float f10) {
        this.f2778a = f10;
    }

    @Override // K5.c
    public float a(RectF rectF) {
        return this.f2778a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f2778a == ((a) obj).f2778a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f2778a)});
    }
}
