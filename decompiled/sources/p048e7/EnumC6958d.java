package p048e7;

import B6.f;
import kotlin.enums.EnumEntries;
import p189s8.a;

/* JADX INFO: renamed from: e7.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC6958d implements f {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f43475i = a.a(c());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f43476a;

    EnumC6958d(int i10) {
        this.f43476a = i10;
    }

    @Override // B6.f
    public int getNumber() {
        return this.f43476a;
    }
}
