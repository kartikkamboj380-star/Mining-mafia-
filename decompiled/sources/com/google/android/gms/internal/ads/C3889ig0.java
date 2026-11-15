package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ig0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3889ig0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC5399ug0 f29492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC5399ug0 f29493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f29494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final EnumC4392mg0 f29495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EnumC4770pg0 f29496e;

    private C3889ig0(EnumC4392mg0 enumC4392mg0, EnumC4770pg0 enumC4770pg0, EnumC5399ug0 enumC5399ug0, EnumC5399ug0 enumC5399ug1, boolean z9) {
        this.f29495d = enumC4392mg0;
        this.f29496e = enumC4770pg0;
        this.f29492a = enumC5399ug0;
        if (enumC5399ug1 == null) {
            this.f29493b = EnumC5399ug0.NONE;
        } else {
            this.f29493b = enumC5399ug1;
        }
        this.f29494c = z9;
    }

    public static C3889ig0 a(EnumC4392mg0 enumC4392mg0, EnumC4770pg0 enumC4770pg0, EnumC5399ug0 enumC5399ug0, EnumC5399ug0 enumC5399ug1, boolean z9) {
        AbstractC3640gh0.b(enumC4392mg0, "CreativeType is null");
        AbstractC3640gh0.b(enumC4770pg0, "ImpressionType is null");
        AbstractC3640gh0.b(enumC5399ug0, "Impression owner is null");
        if (enumC5399ug0 == EnumC5399ug0.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (enumC4392mg0 == EnumC4392mg0.DEFINED_BY_JAVASCRIPT && enumC5399ug0 == EnumC5399ug0.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (enumC4770pg0 == EnumC4770pg0.DEFINED_BY_JAVASCRIPT && enumC5399ug0 == EnumC5399ug0.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new C3889ig0(enumC4392mg0, enumC4770pg0, enumC5399ug0, enumC5399ug1, z9);
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        AbstractC3137ch0.c(jSONObject, "impressionOwner", this.f29492a);
        AbstractC3137ch0.c(jSONObject, "mediaEventsOwner", this.f29493b);
        AbstractC3137ch0.c(jSONObject, "creativeType", this.f29495d);
        AbstractC3137ch0.c(jSONObject, "impressionType", this.f29496e);
        AbstractC3137ch0.c(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f29494c));
        return jSONObject;
    }
}
