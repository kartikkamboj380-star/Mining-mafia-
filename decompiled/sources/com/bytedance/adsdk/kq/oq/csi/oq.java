package com.bytedance.adsdk.kq.oq.csi;

import com.bytedance.adsdk.kq.oq.fou.bob;
import com.bytedance.adsdk.kq.oq.fou.fou;
import com.bytedance.adsdk.kq.oq.oq.kq.csi;
import com.bytedance.adsdk.kq.oq.oq.kq.dgq;
import com.bytedance.adsdk.kq.oq.oq.kq.gm;
import com.bytedance.adsdk.kq.oq.oq.kq.rhi;
import com.bytedance.adsdk.kq.oq.oq.kq.sns;
import com.bytedance.adsdk.kq.oq.oq.kq.suf;
import com.bytedance.adsdk.kq.oq.oq.kq.syt;
import com.bytedance.adsdk.kq.oq.oq.kq.ubx;
import com.bytedance.adsdk.kq.oq.oq.kq.vvw;
import com.bytedance.adsdk.kq.oq.oq.kq.wcx;
import com.bytedance.adsdk.kq.oq.oq.kq.wki;
import com.unity3d.services.UnityAdsConstants;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class oq {

    /* JADX INFO: renamed from: com.bytedance.adsdk.kq.oq.csi.oq$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] kq;

        static {
            int[] iArr = new int[bob.values().length];
            kq = iArr;
            try {
                iArr[bob.MINUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                kq[bob.PLUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                kq[bob.DIVISION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                kq[bob.MULTI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                kq[bob.MOD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                kq[bob.EQ.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                kq[bob.NOT_EQ.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                kq[bob.GT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                kq[bob.LT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                kq[bob.GT_EQ.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                kq[bob.LT_EQ.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                kq[bob.DOUBLE_AMP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                kq[bob.DOUBLE_BAR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    private static void bob(List<com.bytedance.adsdk.kq.oq.oq.kq> list, String str, int i10) {
        Iterator<com.bytedance.adsdk.kq.oq.oq.kq> it = list.iterator();
        while (it.hasNext()) {
            if (fou.kq(it.next().kq())) {
                throw new IllegalArgumentException(str.substring(0, i10));
            }
        }
    }

    public static com.bytedance.adsdk.kq.oq.oq.kq kq(List<com.bytedance.adsdk.kq.oq.oq.kq> list, String str, int i10) {
        bob(list, str, i10);
        Deque<com.bytedance.adsdk.kq.oq.oq.kq> dequeKq = kq(oq(list, str, i10));
        if (dequeKq.size() == 1) {
            return dequeKq.getFirst();
        }
        throw new IllegalStateException();
    }

    private static Deque<com.bytedance.adsdk.kq.oq.oq.kq> oq(List<com.bytedance.adsdk.kq.oq.oq.kq> list, String str, int i10) {
        LinkedList<com.bytedance.adsdk.kq.oq.oq.kq> linkedList = new LinkedList(list);
        int i11 = 5;
        while (i11 > 0) {
            LinkedList linkedList2 = new LinkedList();
            for (com.bytedance.adsdk.kq.oq.oq.kq kqVar : linkedList) {
                if (!linkedList2.isEmpty() && bob.kq(((com.bytedance.adsdk.kq.oq.oq.kq) linkedList2.peekLast()).kq()) && ((bob) ((com.bytedance.adsdk.kq.oq.oq.kq) linkedList2.peekLast()).kq()).oq() == i11) {
                    com.bytedance.adsdk.kq.oq.oq.kq kqVar2 = (com.bytedance.adsdk.kq.oq.oq.kq) linkedList2.pollLast();
                    com.bytedance.adsdk.kq.oq.oq.kq kqVar3 = (com.bytedance.adsdk.kq.oq.oq.kq) linkedList2.pollLast();
                    if (bob.kq(kqVar3.kq()) || bob.kq(kqVar.kq())) {
                        throw new IllegalArgumentException(str.substring(0, i10));
                    }
                    linkedList2.addLast(kq(kqVar3, kqVar2, kqVar));
                } else {
                    linkedList2.addLast(kqVar);
                }
            }
            i11--;
            linkedList = linkedList2;
        }
        return linkedList;
    }

    private static Deque<com.bytedance.adsdk.kq.oq.oq.kq> kq(Deque<com.bytedance.adsdk.kq.oq.oq.kq> deque) {
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.adsdk.kq.oq.oq.kq kqVar : deque) {
            if (!linkedList.isEmpty() && ((com.bytedance.adsdk.kq.oq.oq.kq) linkedList.peekLast()).kq() == bob.COLON) {
                linkedList.pollLast();
                com.bytedance.adsdk.kq.oq.oq.kq kqVar2 = (com.bytedance.adsdk.kq.oq.oq.kq) linkedList.pollLast();
                if (((com.bytedance.adsdk.kq.oq.oq.kq) linkedList.pollLast()).kq() == bob.QUESTION) {
                    com.bytedance.adsdk.kq.oq.oq.kq kqVar3 = (com.bytedance.adsdk.kq.oq.oq.kq) linkedList.pollLast();
                    gm gmVar = new gm();
                    gmVar.kq(kqVar3);
                    gmVar.oq(kqVar2);
                    gmVar.bob(kqVar);
                    linkedList.addLast(gmVar);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                linkedList.addLast(kqVar);
            }
        }
        return linkedList;
    }

    private static com.bytedance.adsdk.kq.oq.oq.kq kq(com.bytedance.adsdk.kq.oq.oq.kq kqVar, com.bytedance.adsdk.kq.oq.oq.kq kqVar2, com.bytedance.adsdk.kq.oq.oq.kq kqVar3) {
        sns ubxVar;
        switch (AnonymousClass1.kq[((bob) kqVar2.kq()).ordinal()]) {
            case 1:
                ubxVar = new ubx();
                break;
            case 2:
                ubxVar = new wcx();
                break;
            case 3:
                ubxVar = new com.bytedance.adsdk.kq.oq.oq.kq.kq();
                break;
            case 4:
                ubxVar = new wki();
                break;
            case 5:
                ubxVar = new vvw();
                break;
            case 6:
                ubxVar = new com.bytedance.adsdk.kq.oq.oq.kq.fou();
                break;
            case 7:
                ubxVar = new suf();
                break;
            case 8:
                ubxVar = new rhi();
                break;
            case 9:
                ubxVar = new dgq();
                break;
            case 10:
                ubxVar = new csi();
                break;
            case 11:
                ubxVar = new syt();
                break;
            case 12:
                ubxVar = new com.bytedance.adsdk.kq.oq.oq.kq.oq();
                break;
            case 13:
                ubxVar = new com.bytedance.adsdk.kq.oq.oq.kq.bob();
                break;
            default:
                throw new UnsupportedOperationException(kqVar2.kq().toString());
        }
        ubxVar.kq(kqVar);
        ubxVar.oq(kqVar3);
        return ubxVar;
    }

    public static boolean kq(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) {
            return !(obj instanceof Number) || ((Number) obj).floatValue() >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return false;
    }
}
