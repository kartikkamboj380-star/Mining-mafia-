package p117l6;

import java.io.File;
import p147o6.F;

/* JADX INFO: renamed from: l6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C7041b extends C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F f46141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f46142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f46143c;

    C7041b(F f10, String str, File file) {
        if (f10 == null) {
            throw new NullPointerException("Null report");
        }
        this.f46141a = f10;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f46142b = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.f46143c = file;
    }

    @Override // p117l6.C
    public F b() {
        return this.f46141a;
    }

    @Override // p117l6.C
    public File c() {
        return this.f46143c;
    }

    @Override // p117l6.C
    public String d() {
        return this.f46142b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C) {
            C c10 = (C) obj;
            if (this.f46141a.equals(c10.b()) && this.f46142b.equals(c10.d()) && this.f46143c.equals(c10.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f46141a.hashCode() ^ 1000003) * 1000003) ^ this.f46142b.hashCode()) * 1000003) ^ this.f46143c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f46141a + ", sessionId=" + this.f46142b + ", reportFile=" + this.f46143c + "}";
    }
}
