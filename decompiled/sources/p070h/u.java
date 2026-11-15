package p070h;

import K.i;
import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
abstract class u {
    private static i a(i iVar, i iVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i10 = 0;
        while (i10 < iVar.g() + iVar2.g()) {
            Locale localeC = i10 < iVar.g() ? iVar.c(i10) : iVar2.c(i10 - iVar.g());
            if (localeC != null) {
                linkedHashSet.add(localeC);
            }
            i10++;
        }
        return i.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    static i b(i iVar, i iVar2) {
        return (iVar == null || iVar.f()) ? i.e() : a(iVar, iVar2);
    }
}
