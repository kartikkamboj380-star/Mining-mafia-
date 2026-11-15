package p155p4;

import android.content.Context;
import p245y4.a;

/* JADX INFO: loaded from: classes2.dex */
final class c extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f47865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f47866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f47867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f47868d;

    c(Context context, a aVar, a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f47865a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f47866b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f47867c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f47868d = str;
    }

    @Override // p155p4.h
    public Context b() {
        return this.f47865a;
    }

    @Override // p155p4.h
    public String c() {
        return this.f47868d;
    }

    @Override // p155p4.h
    public a d() {
        return this.f47867c;
    }

    @Override // p155p4.h
    public a e() {
        return this.f47866b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f47865a.equals(hVar.b()) && this.f47866b.equals(hVar.e()) && this.f47867c.equals(hVar.d()) && this.f47868d.equals(hVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f47865a.hashCode() ^ 1000003) * 1000003) ^ this.f47866b.hashCode()) * 1000003) ^ this.f47867c.hashCode()) * 1000003) ^ this.f47868d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f47865a + ", wallClock=" + this.f47866b + ", monotonicClock=" + this.f47867c + ", backendName=" + this.f47868d + "}";
    }
}
