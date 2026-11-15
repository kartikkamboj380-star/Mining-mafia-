package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public class N8 implements InterfaceC5078s8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M8 f21073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final P8 f21074b;

    public N8(M8 m10) {
        P8 p10 = new P8(CodedOutputStream.DEFAULT_BUFFER_SIZE);
        this.f21073a = m10;
        this.f21074b = p10;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01be  */
    /* JADX WARN: Code duplicated, block: B:102:0x01c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:105:0x01db  */
    /* JADX WARN: Code duplicated, block: B:119:0x0210  */
    /* JADX WARN: Code duplicated, block: B:146:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x01b6  */
    @Override // com.google.android.gms.internal.ads.InterfaceC5078s8
    public C5456v8 a(AbstractC5960z8 abstractC5960z8) throws Throwable {
        byte[] bArr;
        int iA;
        H8 c5330u8;
        String str;
        C5456v8 c5456v8;
        int iP;
        Map map;
        byte[] byteArray;
        byte[] bArrA;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            W8 w10 = null;
            try {
                C3821i8 c3821i8L = abstractC5960z8.l();
                if (c3821i8L == null) {
                    map = Collections.EMPTY_MAP;
                } else {
                    HashMap map2 = new HashMap();
                    String str2 = c3821i8L.f29281b;
                    if (str2 != null) {
                        map2.put("If-None-Match", str2);
                    }
                    long j10 = c3821i8L.f29283d;
                    if (j10 > 0) {
                        map2.put("If-Modified-Since", V8.c(j10));
                    }
                    map = map2;
                }
                W8 w8A = this.f21073a.a(abstractC5960z8, map);
                try {
                    int iA2 = w8A.a();
                    List listB = w8A.b();
                    if (iA2 == 304) {
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        C3821i8 c3821i8L2 = abstractC5960z8.l();
                        if (c3821i8L2 == null) {
                            return new C5456v8(304, (byte[]) null, true, jElapsedRealtime2, listB);
                        }
                        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                        if (!listB.isEmpty()) {
                            Iterator it = listB.iterator();
                            while (it.hasNext()) {
                                treeSet.add(((C4952r8) it.next()).a());
                            }
                        }
                        ArrayList arrayList = new ArrayList(listB);
                        List list = c3821i8L2.f29287h;
                        if (list != null) {
                            if (!list.isEmpty()) {
                                for (C4952r8 c4952r8 : c3821i8L2.f29287h) {
                                    if (!treeSet.contains(c4952r8.a())) {
                                        arrayList.add(c4952r8);
                                    }
                                }
                            }
                        } else if (!c3821i8L2.f29286g.isEmpty()) {
                            for (Map.Entry entry : c3821i8L2.f29286g.entrySet()) {
                                if (!treeSet.contains(entry.getKey())) {
                                    arrayList.add(new C4952r8((String) entry.getKey(), (String) entry.getValue()));
                                }
                            }
                        }
                        return new C5456v8(304, c3821i8L2.f29280a, true, jElapsedRealtime2, (List) arrayList);
                    }
                    InputStream inputStreamD = w8A.d();
                    if (inputStreamD != null) {
                        int iC = w8A.c();
                        P8 p10 = this.f21074b;
                        C2943b9 c2943b9 = new C2943b9(p10, iC);
                        try {
                            bArrA = p10.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
                            while (true) {
                                try {
                                    int i10 = inputStreamD.read(bArrA);
                                    if (i10 == -1) {
                                        break;
                                    }
                                    c2943b9.write(bArrA, 0, i10);
                                } catch (Throwable th) {
                                    th = th;
                                    try {
                                        inputStreamD.close();
                                    } catch (IOException unused) {
                                        K8.a("Error occurred when closing InputStream", new Object[0]);
                                    }
                                    p10.b(bArrA);
                                    c2943b9.close();
                                    throw th;
                                }
                            }
                            byteArray = c2943b9.toByteArray();
                            try {
                                inputStreamD.close();
                            } catch (IOException unused2) {
                                K8.a("Error occurred when closing InputStream", new Object[0]);
                            }
                            p10.b(bArrA);
                            c2943b9.close();
                        } catch (Throwable th2) {
                            th = th2;
                            bArrA = null;
                        }
                    } else {
                        byteArray = new byte[0];
                    }
                    byte[] bArr2 = byteArray;
                    try {
                        long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        if (K8.f20109b || jElapsedRealtime3 > 3000) {
                            K8.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", abstractC5960z8, Long.valueOf(jElapsedRealtime3), bArr2 != null ? Integer.valueOf(bArr2.length) : "null", Integer.valueOf(iA2), Integer.valueOf(abstractC5960z8.z().b()));
                        }
                        if (iA2 < 200 || iA2 > 299) {
                            throw new IOException();
                        }
                        return new C5456v8(iA2, bArr2, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listB);
                    } catch (IOException e10) {
                        e = e10;
                        w10 = w8A;
                        bArr = bArr2;
                        if (e instanceof SocketTimeoutException) {
                            c5330u8 = new G8();
                            str = "socket";
                        } else {
                            if (!(e instanceof MalformedURLException)) {
                                throw new RuntimeException("Bad URL ".concat(String.valueOf(abstractC5960z8.i())), e);
                            }
                            if (w10 != null) {
                                throw new C5582w8(e);
                            }
                            iA = w10.a();
                            K8.c("Unexpected response code %d for %s", Integer.valueOf(iA), abstractC5960z8.i());
                            if (bArr != null) {
                                c5456v8 = new C5456v8(iA, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, w10.b());
                                if (iA == 401 && iA != 403) {
                                    if (iA < 400 || iA > 499) {
                                        throw new F8(c5456v8);
                                    }
                                    throw new C4323m8(c5456v8);
                                }
                                c5330u8 = new C3695h8(c5456v8);
                                str = "auth";
                            } else {
                                c5330u8 = new C5330u8();
                                str = "network";
                            }
                        }
                        C4449n8 c4449n8Z = abstractC5960z8.z();
                        iP = abstractC5960z8.p();
                        try {
                            c4449n8Z.c(c5330u8);
                            abstractC5960z8.d(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(iP)));
                        } catch (H8 e11) {
                            abstractC5960z8.d(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(iP)));
                            throw e11;
                        }
                    }
                } catch (IOException e12) {
                    e = e12;
                    bArr = null;
                    w10 = w8A;
                    if (e instanceof SocketTimeoutException) {
                        c5330u8 = new G8();
                        str = "socket";
                    } else {
                        if (!(e instanceof MalformedURLException)) {
                            throw new RuntimeException("Bad URL ".concat(String.valueOf(abstractC5960z8.i())), e);
                        }
                        if (w10 != null) {
                            throw new C5582w8(e);
                        }
                        iA = w10.a();
                        K8.c("Unexpected response code %d for %s", Integer.valueOf(iA), abstractC5960z8.i());
                        if (bArr != null) {
                            c5456v8 = new C5456v8(iA, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, w10.b());
                            if (iA == 401) {
                            }
                            c5330u8 = new C3695h8(c5456v8);
                            str = "auth";
                        } else {
                            c5330u8 = new C5330u8();
                            str = "network";
                        }
                    }
                    C4449n8 c4449n8Z2 = abstractC5960z8.z();
                    iP = abstractC5960z8.p();
                    c4449n8Z2.c(c5330u8);
                    abstractC5960z8.d(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(iP)));
                }
            } catch (IOException e13) {
                e = e13;
                bArr = null;
            }
            abstractC5960z8.d(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(iP)));
        }
    }
}
