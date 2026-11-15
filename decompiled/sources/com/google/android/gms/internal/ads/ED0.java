package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ED0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f18440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f18441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f18442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f18443d;

    /* synthetic */ ED0(BD0 bd0, byte[] bArr) {
        this.f18440a = new HashMap(bd0.e());
        this.f18441b = new HashMap(bd0.f());
        this.f18442c = new HashMap(bd0.g());
        this.f18443d = new HashMap(bd0.h());
    }

    public final boolean a(AD0 ad0) {
        return this.f18441b.containsKey(new CD0(ad0.getClass(), ad0.b(), null));
    }

    public final AbstractC4050jy0 b(AD0 ad0, C1703Ey0 c1703Ey0) throws GeneralSecurityException {
        CD0 cd0 = new CD0(ad0.getClass(), ad0.b(), null);
        Map map = this.f18441b;
        if (map.containsKey(cd0)) {
            return ((AbstractC5717xC0) map.get(cd0)).a(ad0, c1703Ey0);
        }
        String string = cd0.toString();
        StringBuilder sb = new StringBuilder(string.length() + 47);
        sb.append("No Key Parser for requested key type ");
        sb.append(string);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }

    public final AD0 c(AbstractC4050jy0 abstractC4050jy0, Class cls, C1703Ey0 c1703Ey0) throws GeneralSecurityException {
        DD0 dd0 = new DD0(abstractC4050jy0.getClass(), cls, null);
        Map map = this.f18440a;
        if (map.containsKey(dd0)) {
            return ((AC0) map.get(dd0)).a(abstractC4050jy0, c1703Ey0);
        }
        String string = dd0.toString();
        StringBuilder sb = new StringBuilder(string.length() + 32);
        sb.append("No Key serializer for ");
        sb.append(string);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }

    public final boolean d(AD0 ad0) {
        return this.f18443d.containsKey(new CD0(ad0.getClass(), ad0.b(), null));
    }

    public final AbstractC1495Ay0 e(AD0 ad0) throws GeneralSecurityException {
        CD0 cd0 = new CD0(ad0.getClass(), ad0.b(), null);
        Map map = this.f18443d;
        if (map.containsKey(cd0)) {
            return ((AbstractC3203dD0) map.get(cd0)).a(ad0);
        }
        String string = cd0.toString();
        StringBuilder sb = new StringBuilder(string.length() + 54);
        sb.append("No Parameters Parser for requested key type ");
        sb.append(string);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }

    public final AD0 f(AbstractC1495Ay0 abstractC1495Ay0, Class cls) throws GeneralSecurityException {
        DD0 dd0 = new DD0(abstractC1495Ay0.getClass(), cls, null);
        Map map = this.f18442c;
        if (map.containsKey(dd0)) {
            return ((AbstractC3580gD0) map.get(dd0)).a(abstractC1495Ay0);
        }
        String string = dd0.toString();
        StringBuilder sb = new StringBuilder(string.length() + 39);
        sb.append("No Key Format serializer for ");
        sb.append(string);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }

    final /* synthetic */ Map g() {
        return this.f18440a;
    }

    final /* synthetic */ Map h() {
        return this.f18441b;
    }

    final /* synthetic */ Map i() {
        return this.f18442c;
    }

    final /* synthetic */ Map j() {
        return this.f18443d;
    }
}
