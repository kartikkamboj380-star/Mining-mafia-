package com.facebook.yoga;

import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes2.dex */
public enum k {
    NONE(0),
    STRETCH_FLEX_BASIS(1),
    ABSOLUTE_POSITION_WITHOUT_INSETS_EXCLUDES_PADDING(2),
    ABSOLUTE_PERCENT_AGAINST_INNER_SIZE(4),
    ALL(Api.BaseClientBuilder.API_PRIORITY_OTHER),
    CLASSIC(2147483646);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f16652a;

    k(int i10) {
        this.f16652a = i10;
    }

    public int d() {
        return this.f16652a;
    }
}
