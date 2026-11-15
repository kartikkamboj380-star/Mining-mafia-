package p124m3;

import kotlin.enums.EnumEntries;
import p189s8.a;

/* JADX INFO: loaded from: classes.dex */
public enum f {
    JS("JS"),
    NATIVE("Native");


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f46404e = a.a(c());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46405a;

    f(String str) {
        this.f46405a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f46405a;
    }
}
