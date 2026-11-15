package Z8;

import kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes3.dex */
public enum D {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f7181h = p189s8.a.a(c());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f7182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f7183b;

    D(char c10, char c11) {
        this.f7182a = c10;
        this.f7183b = c11;
    }

    public static EnumEntries d() {
        return f7181h;
    }
}
