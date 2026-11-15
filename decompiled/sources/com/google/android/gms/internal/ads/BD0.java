package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class BD0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f17534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f17535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f17536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f17537d;

    public BD0() {
        this.f17534a = new HashMap();
        this.f17535b = new HashMap();
        this.f17536c = new HashMap();
        this.f17537d = new HashMap();
    }

    public final BD0 a(AC0 ac0) throws GeneralSecurityException {
        DD0 dd0 = new DD0(ac0.b(), ac0.c(), null);
        Map map = this.f17534a;
        if (!map.containsKey(dd0)) {
            map.put(dd0, ac0);
            return this;
        }
        AC0 ac1 = (AC0) map.get(dd0);
        if (ac1.equals(ac0) && ac0.equals(ac1)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(dd0.toString()));
    }

    public final BD0 b(AbstractC5717xC0 abstractC5717xC0) throws GeneralSecurityException {
        CD0 cd0 = new CD0(abstractC5717xC0.c(), abstractC5717xC0.b(), null);
        Map map = this.f17535b;
        if (!map.containsKey(cd0)) {
            map.put(cd0, abstractC5717xC0);
            return this;
        }
        AbstractC5717xC0 abstractC5717xC1 = (AbstractC5717xC0) map.get(cd0);
        if (abstractC5717xC1.equals(abstractC5717xC0) && abstractC5717xC0.equals(abstractC5717xC1)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(cd0.toString()));
    }

    public final BD0 c(AbstractC3580gD0 abstractC3580gD0) throws GeneralSecurityException {
        DD0 dd0 = new DD0(abstractC3580gD0.b(), abstractC3580gD0.c(), null);
        Map map = this.f17536c;
        if (!map.containsKey(dd0)) {
            map.put(dd0, abstractC3580gD0);
            return this;
        }
        AbstractC3580gD0 abstractC3580gD1 = (AbstractC3580gD0) map.get(dd0);
        if (abstractC3580gD1.equals(abstractC3580gD0) && abstractC3580gD0.equals(abstractC3580gD1)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(dd0.toString()));
    }

    public final BD0 d(AbstractC3203dD0 abstractC3203dD0) throws GeneralSecurityException {
        CD0 cd0 = new CD0(abstractC3203dD0.c(), abstractC3203dD0.b(), null);
        Map map = this.f17537d;
        if (!map.containsKey(cd0)) {
            map.put(cd0, abstractC3203dD0);
            return this;
        }
        AbstractC3203dD0 abstractC3203dD1 = (AbstractC3203dD0) map.get(cd0);
        if (abstractC3203dD1.equals(abstractC3203dD0) && abstractC3203dD0.equals(abstractC3203dD1)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(cd0.toString()));
    }

    final /* synthetic */ Map e() {
        return this.f17534a;
    }

    final /* synthetic */ Map f() {
        return this.f17535b;
    }

    final /* synthetic */ Map g() {
        return this.f17536c;
    }

    final /* synthetic */ Map h() {
        return this.f17537d;
    }

    public BD0(ED0 ed0) {
        this.f17534a = new HashMap(ed0.g());
        this.f17535b = new HashMap(ed0.h());
        this.f17536c = new HashMap(ed0.i());
        this.f17537d = new HashMap(ed0.j());
    }
}
