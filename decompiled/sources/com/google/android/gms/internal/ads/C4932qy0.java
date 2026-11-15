package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qy0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4932qy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f32750a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JC0 f32751b = JC0.f19805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f32752c = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void c() {
        Iterator it = this.f32750a.iterator();
        while (it.hasNext()) {
            ((C4680oy0) it.next()).d(false);
        }
    }

    public final C4932qy0 a(C4680oy0 c4680oy0) {
        if (c4680oy0.h() != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (c4680oy0.c()) {
            c();
        }
        c4680oy0.i(this);
        this.f32750a.add(c4680oy0);
        return this;
    }

    public final C5561vy0 b() throws GeneralSecurityException {
        int i10;
        if (this.f32752c) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        this.f32752c = true;
        List<C4680oy0> list = this.f32750a;
        ArrayList arrayList = new ArrayList(list.size());
        int i11 = 0;
        while (i11 < list.size() - 1) {
            int i12 = i11 + 1;
            if (((C4680oy0) list.get(i11)).g() == C4806py0.f32524a && ((C4680oy0) list.get(i12)).g() != C4806py0.f32524a) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i11 = i12;
        }
        HashSet hashSet = new HashSet();
        byte[] bArr = null;
        Integer num = null;
        for (C4680oy0 c4680oy0 : list) {
            c4680oy0.e();
            if (c4680oy0.g() == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            int i13 = 3;
            if (c4680oy0.g() == C4806py0.f32524a) {
                int i14 = 0;
                while (true) {
                    if (i14 != 0 && !hashSet.contains(Integer.valueOf(i14))) {
                        break;
                    }
                    int i15 = HD0.f19242a;
                    i14 = 0;
                    while (i14 == 0) {
                        byte[] bArrA = AbstractC5845yD0.a(4);
                        i14 = (bArrA[3] & 255) | ((bArrA[0] & 255) << 24) | ((bArrA[1] & 255) << 16) | ((bArrA[2] & 255) << 8);
                    }
                }
                i10 = i14;
            } else {
                c4680oy0.g();
                i10 = 0;
            }
            Integer numValueOf = Integer.valueOf(i10);
            if (hashSet.contains(numValueOf)) {
                int i16 = i10;
                StringBuilder sb = new StringBuilder(String.valueOf(i16).length() + 31);
                sb.append("Id ");
                sb.append(i16);
                sb.append(" is used twice in the keyset");
                throw new GeneralSecurityException(sb.toString());
            }
            hashSet.add(numValueOf);
            AbstractC4050jy0 abstractC4050jy0C = PC0.a().c(c4680oy0.f(), true != c4680oy0.f().a() ? null : numValueOf);
            C4428my0 c4428my0E = c4680oy0.e();
            C4428my0 c4428my0 = C4428my0.f31625b;
            if (!c4428my0.equals(c4428my0E)) {
                if (C4428my0.f31626c.equals(c4428my0E)) {
                    i13 = 4;
                } else {
                    if (!C4428my0.f31627d.equals(c4428my0E)) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    i13 = 5;
                }
            }
            C5309ty0 c5309ty0 = new C5309ty0(abstractC4050jy0C, i13, i10, c4680oy0.c(), false, C5309ty0.f33518h, null);
            if (c4680oy0.c()) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (c4680oy0.e() != c4428my0) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = numValueOf;
            }
            arrayList.add(c5309ty0);
        }
        if (num != null) {
            return C5561vy0.g(new C5561vy0(arrayList, this.f32751b, bArr));
        }
        throw new GeneralSecurityException("No primary was set");
    }
}
