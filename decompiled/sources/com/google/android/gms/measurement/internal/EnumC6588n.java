package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
enum EnumC6588n {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f38215a;

    EnumC6588n(char c10) {
        this.f38215a = c10;
    }

    public static EnumC6588n c(char c10) {
        for (EnumC6588n enumC6588n : values()) {
            if (enumC6588n.f38215a == c10) {
                return enumC6588n;
            }
        }
        return UNSET;
    }

    final /* synthetic */ char d() {
        return this.f38215a;
    }
}
