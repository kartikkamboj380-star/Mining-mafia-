package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f40929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f40930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ n[] f40931c;

    final enum a extends n {
        a(String str, int i10) {
            super(str, i10, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        f40929a = aVar;
        n nVar = new n("STRING", 1) { // from class: com.google.gson.n.b
            {
                a aVar2 = null;
            }
        };
        f40930b = nVar;
        f40931c = new n[]{aVar, nVar};
    }

    private n(String str, int i10) {
        super(str, i10);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f40931c.clone();
    }

    /* synthetic */ n(String str, int i10, a aVar) {
        this(str, i10);
    }
}
