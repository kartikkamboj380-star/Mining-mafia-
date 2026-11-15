package p117l6;

import java.io.File;
import java.io.IOException;
import p177r6.g;

/* JADX INFO: loaded from: classes3.dex */
class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f46076b;

    public A(String str, g gVar) {
        this.f46075a = str;
        this.f46076b = gVar;
    }

    private File b() {
        return this.f46076b.g(this.f46075a);
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e10) {
            p087i6.g.f().e("Error creating marker: " + this.f46075a, e10);
            return false;
        }
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
