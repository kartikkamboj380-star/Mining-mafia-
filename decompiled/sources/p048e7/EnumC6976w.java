package p048e7;

import B6.f;
import kotlin.enums.EnumEntries;
import p189s8.a;

/* JADX INFO: renamed from: e7.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC6976w implements f {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f43515g = a.a(c());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f43516a;

    EnumC6976w(int i10) {
        this.f43516a = i10;
    }

    @Override // B6.f
    public int getNumber() {
        return this.f43516a;
    }
}
