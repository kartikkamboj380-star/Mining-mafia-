package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5496vS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f34064a = new ConcurrentHashMap();

    C5496vS() {
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    public final synchronized void a(long j10, int i10, long j11) {
        int iIntValue;
        ArrayDeque arrayDeque;
        Long l10;
        try {
            if (((Boolean) H4.B.c().d(AbstractC3892ii.f29658P8)).booleanValue()) {
                if (i10 == 2) {
                    C5244tS c5244tS = new C5244tS();
                    c5244tS.a(j10);
                    c5244tS.b(1);
                    AbstractC5874yS abstractC5874ySC = c5244tS.c();
                    Map map = this.f34064a;
                    ArrayDeque arrayDeque2 = (ArrayDeque) map.get(abstractC5874ySC);
                    if (arrayDeque2 != null && !arrayDeque2.isEmpty()) {
                        arrayDeque2.removeFirst();
                        if (arrayDeque2.isEmpty()) {
                            map.remove(abstractC5874ySC);
                        }
                    }
                    i10 = 2;
                }
                C5244tS c5244tS2 = new C5244tS();
                c5244tS2.a(j10);
                c5244tS2.b(i10);
                AbstractC5874yS abstractC5874ySC2 = c5244tS2.c();
                int iB = abstractC5874ySC2.b();
                if (iB == 0) {
                    iIntValue = 0;
                } else if (iB == 1) {
                    iIntValue = ((Integer) H4.B.c().d(AbstractC3892ii.f29718V8)).intValue();
                } else if (iB == 2) {
                    iIntValue = ((Integer) H4.B.c().d(AbstractC3892ii.f29728W8)).intValue();
                } else if (iB != 3) {
                    iIntValue = 0;
                } else {
                    iIntValue = ((Integer) H4.B.c().d(AbstractC3892ii.f29738X8)).intValue();
                }
                if (iIntValue > 0) {
                    Map map2 = this.f34064a;
                    ArrayDeque arrayDeque3 = (ArrayDeque) map2.get(abstractC5874ySC2);
                    if (arrayDeque3 == null) {
                        arrayDeque3 = new ArrayDeque();
                        map2.put(abstractC5874ySC2, arrayDeque3);
                    }
                    arrayDeque3.addLast(Long.valueOf(j11));
                    while (arrayDeque3.size() > iIntValue) {
                        arrayDeque3.removeFirst();
                    }
                    c();
                    int iIntValue2 = ((Integer) H4.B.c().d(AbstractC3892ii.f29748Y8)).intValue();
                    if (iIntValue2 <= 0) {
                        map2.clear();
                        return;
                    }
                    while (true) {
                        Iterator it = map2.values().iterator();
                        int size = 0;
                        while (it.hasNext()) {
                            size += ((ArrayDeque) it.next()).size();
                        }
                        if (size <= iIntValue2) {
                            break;
                        }
                        if (!map2.isEmpty()) {
                            Long l11 = Long.MAX_VALUE;
                            Map.Entry entry = null;
                            for (Map.Entry entry2 : map2.entrySet()) {
                                ArrayDeque arrayDeque4 = (ArrayDeque) entry2.getValue();
                                if (!arrayDeque4.isEmpty() && (l10 = (Long) arrayDeque4.peekFirst()) != null && l10.longValue() < l11.longValue()) {
                                    entry = entry2;
                                    l11 = l10;
                                }
                            }
                            if (entry != null && (arrayDeque = (ArrayDeque) entry.getValue()) != null && !arrayDeque.isEmpty()) {
                                arrayDeque.removeFirst();
                                if (arrayDeque.isEmpty()) {
                                    map2.remove(entry.getKey());
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Map b() {
        HashMap map;
        map = new HashMap();
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29658P8)).booleanValue()) {
            c();
            for (Map.Entry entry : this.f34064a.entrySet()) {
                map.put((AbstractC5874yS) entry.getKey(), new ArrayDeque((Collection) entry.getValue()));
            }
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    final void c() {
        long jLongValue;
        long jCurrentTimeMillis = G4.t.o().currentTimeMillis();
        Iterator it = this.f34064a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            AbstractC5874yS abstractC5874yS = (AbstractC5874yS) entry.getKey();
            ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
            int iB = abstractC5874yS.b();
            if (iB == 0) {
                jLongValue = 0;
            } else if (iB == 1) {
                jLongValue = ((Long) H4.B.c().d(AbstractC3892ii.f29688S8)).longValue();
            } else if (iB == 2) {
                jLongValue = ((Long) H4.B.c().d(AbstractC3892ii.f29698T8)).longValue();
            } else if (iB != 3) {
                jLongValue = 0;
            } else {
                jLongValue = ((Long) H4.B.c().d(AbstractC3892ii.f29708U8)).longValue();
            }
            if (jLongValue == 0) {
                it.remove();
                jLongValue = 0;
            }
            if (jLongValue > 0) {
                Iterator it2 = arrayDeque.iterator();
                while (it2.hasNext() && jCurrentTimeMillis - ((Long) it2.next()).longValue() > jLongValue) {
                    it2.remove();
                }
                if (arrayDeque.isEmpty()) {
                    it.remove();
                }
            }
        }
    }
}
