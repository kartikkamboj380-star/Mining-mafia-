package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
enum EnumC6384a {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11),
    NETWORK_ERROR(12);


    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final AbstractC6432m f37176H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37192a;

    static {
        C6428l c6428l = new C6428l();
        for (EnumC6384a enumC6384a : values()) {
            c6428l.a(Integer.valueOf(enumC6384a.f37192a), enumC6384a);
        }
        f37176H = c6428l.b();
    }

    EnumC6384a(int i10) {
        this.f37192a = i10;
    }

    static EnumC6384a c(int i10) {
        AbstractC6432m abstractC6432m = f37176H;
        Integer numValueOf = Integer.valueOf(i10);
        return !abstractC6432m.containsKey(numValueOf) ? RESPONSE_CODE_UNSPECIFIED : (EnumC6384a) abstractC6432m.get(numValueOf);
    }
}
