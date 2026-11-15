package p048e7;

import B6.f;
import kotlin.enums.EnumEntries;
import p189s8.a;

/* JADX INFO: renamed from: e7.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC6964j implements f {
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f43487e = a.a(c());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f43488a;

    EnumC6964j(int i10) {
        this.f43488a = i10;
    }

    @Override // B6.f
    public int getNumber() {
        return this.f43488a;
    }
}
