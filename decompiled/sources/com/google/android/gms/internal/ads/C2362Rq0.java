package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Rq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2362Rq0 implements InterfaceC2102Mq0, InterfaceC1573Cl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5043rr0 f22930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1571Ck0 f22931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f22932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f22933e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.common.util.concurrent.p f22934f = AbstractC5685wx0.a("E");

    C2362Rq0(Context context, C5043rr0 c5043rr0, C1571Ck0 c1571Ck0, InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0) {
        this.f22929a = context;
        this.f22930b = c5043rr0;
        this.f22931c = c1571Ck0;
        this.f22932d = interfaceExecutorServiceC1805Gx0;
    }

    private final void g(Map map) {
        synchronized (this) {
            map.put("ai", this.f22934f);
        }
    }

    private static String h(Context context) {
        File file = new File(context.getPackageResourcePath());
        if (!file.exists() || !file.canRead()) {
            return "";
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[16384];
                MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
                for (int i10 = fileInputStream.read(bArr); i10 != -1; i10 = fileInputStream.read(bArr)) {
                    messageDigest.update(bArr, 0, i10);
                }
                AbstractC2528Uv0 abstractC2528Uv0G = AbstractC2528Uv0.l().g();
                byte[] bArrDigest = messageDigest.digest();
                String strH = abstractC2528Uv0G.h(bArrDigest, 0, bArrDigest.length);
                fileInputStream.close();
                return strH;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | UnsupportedOperationException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    private static String i(String... strArr) {
        for (int i10 = 0; i10 < 2; i10++) {
            String str = strArr[i10];
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object j(Context context, C1571Ck0 c1571Ck0, final androidx.concurrent.futures.c.a aVar) {
        if (Build.VERSION.SDK_INT < 31) {
            aVar.c("");
            return "";
        }
        try {
            String packageName = context.getPackageName();
            CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            byte[] bArrI = AbstractC2528Uv0.l().g().i(i(c1571Ck0.u0(), "308204433082032ba003020102020900c2e08746644a308d300d06092a864886f70d01010405003074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964301e170d3038303832313233313333345a170d3336303130373233313333345a3074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f696430820120300d06092a864886f70d01010105000382010d00308201080282010100ab562e00d83ba208ae0a966f124e29da11f2ab56d08f58e2cca91303e9b754d372f640a71b1dcb130967624e4656a7776a92193db2e5bfb724a91e77188b0e6a47a43b33d9609b77183145ccdf7b2e586674c9e1565b1f4c6a5955bff251a63dabf9c55c27222252e875e4f8154a645f897168c0b1bfc612eabf785769bb34aa7984dc7e2ea2764cae8307d8c17154d7ee5f64a51a44a602c249054157dc02cd5f5c0e55fbef8519fbe327f0b1511692c5a06f19d18385f5c4dbc2d6b93f68cc2979c70e18ab93866b3bd5db8999552a0e3b4c99df58fb918bedc182ba35e003c1b4b10dd244a8ee24fffd333872ab5221985edab0fc0d0b145b6aa192858e79020103a381d93081d6301d0603551d0e04160414c77d8cc2211756259a7fd382df6be398e4d786a53081a60603551d2304819e30819b8014c77d8cc2211756259a7fd382df6be398e4d786a5a178a4763074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964820900c2e08746644a308d300c0603551d13040530030101ff300d06092a864886f70d010104050003820101006dd252ceef85302c360aaace939bcff2cca904bb5d7a1661f8ae46b2994204d0ff4a68c7ed1a531ec4595a623ce60763b167297a7ae35712c407f208f0cb109429124d7b106219c084ca3eb3f9ad5fb871ef92269a8be28bf16d44c8d9a08e6cb2f005bb3fe2cb96447e868e731076ad45b33f6009ea19c161e62641aa99271dfd5228c5c587875ddb7f452758d661f6cc0cccb7352e424cc4365c523532f7325137593c4ae341f4db41edda0d0b1071a7c440f0fe9ea01cb627ca674369d084bd2fd911ff06cdbf2cfa10dc0f893ae35762919048c7efc64c7144178342f70581c9de573af55b390dd7fdb9418631895d5f759f30112687ff621410c069308a"));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrI)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(AbstractC2528Uv0.l().g().i(i(c1571Ck0.v0(), "308204a830820390a003020102020900d585b86c7dd34ef5300d06092a864886f70d0101040500308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d301e170d3038303431353233333635365a170d3335303930313233333635365a308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d30820120300d06092a864886f70d01010105000382010d00308201080282010100d6ce2e080abfe2314dd18db3cfd3185cb43d33fa0c74e1bdb6d1db8913f62c5c39df56f846813d65bec0f3ca426b07c5a8ed5a3990c167e76bc999b927894b8f0b22001994a92915e572c56d2a301ba36fc5fc113ad6cb9e7435a16d23ab7dfaeee165e4df1f0a8dbda70a869d516c4e9d051196ca7c0c557f175bc375f948c56aae86089ba44f8aa6a4dd9a7dbf2c0a352282ad06b8cc185eb15579eef86d080b1d6189c0f9af98b1c2ebd107ea45abdb68a3c7838a5e5488c76c53d40b121de7bbd30e620c188ae1aa61dbbc87dd3c645f2f55f3d4c375ec4070a93f7151d83670c16a971abe5ef2d11890e1b8aef3298cf066bf9e6ce144ac9ae86d1c1b0f020103a381fc3081f9301d0603551d0e041604148d1cc5be954c433c61863a15b04cbc03f24fe0b23081c90603551d230481c13081be80148d1cc5be954c433c61863a15b04cbc03f24fe0b2a1819aa48197308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d820900d585b86c7dd34ef5300c0603551d13040530030101ff300d06092a864886f70d0101040500038201010019d30cf105fb78923f4c0d7dd223233d40967acfce00081d5bd7c6e9d6ed206b0e11209506416ca244939913d26b4aa0e0f524cad2bb5c6e4ca1016a15916ea1ec5dc95a5e3a010036f49248d5109bbf2e1e618186673a3be56daf0b77b1c229e3c255e3e84c905d2387efba09cbf13b202b4e5a22c93263484a23d2fc29fa9f1939759733afd8aa160f4296c2d0163e8182859c6643e9c1962fa0c18333335bc090ff9a6b22ded1ad444229a539a94eefadabd065ced24b3e51e5dd7b66787bef12fe97fba484c423fb4ff8cc494c02f0f5051612ff6529393e8e46eac5bb21f277c151aa5f2aa627d1e89da70ab6033569de3b9897bfff7ca9da3e1243f60b")))));
            }
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.Oq0
                public final /* synthetic */ void onChecksumsReady(List list) {
                    androidx.concurrent.futures.c.a aVar2 = aVar;
                    if (list == null) {
                        aVar2.c("");
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ApkChecksum apkChecksumA = AbstractC1864Ib.a(list.get(i10));
                            if (apkChecksumA.getType() == 8) {
                                AbstractC2528Uv0 abstractC2528Uv0G = AbstractC2528Uv0.l().g();
                                byte[] value = apkChecksumA.getValue();
                                aVar2.c(abstractC2528Uv0G.h(value, 0, value.length));
                                return;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                    aVar2.c("");
                }
            });
            return "";
        } catch (PackageManager.NameNotFoundException | NoClassDefFoundError | CertificateException unused) {
            aVar.c("");
            return "";
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2102Mq0
    public final void a(Map map) {
        g(map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2102Mq0
    public final void b(Map map) {
        g(map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2102Mq0
    public final void c(Map map, Context context, View view) {
        g(map);
    }

    final /* synthetic */ String d() {
        InterfaceC1899Is0 interfaceC1899Is0 = new InterfaceC1899Is0() { // from class: com.google.android.gms.internal.ads.Pq0
            @Override // com.google.android.gms.internal.ads.InterfaceC1899Is0
            public final /* synthetic */ Object apply(Object obj) {
                return this.f22198a.f((String) obj);
            }
        };
        synchronized (this) {
            C5043rr0 c5043rr0 = this.f22930b;
            final Context context = this.f22929a;
            final C1571Ck0 c1571Ck0 = this.f22931c;
            com.google.common.util.concurrent.p pVarK = AbstractC5685wx0.k(androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0140c() { // from class: com.google.android.gms.internal.ads.Nq0
                @Override // androidx.concurrent.futures.c.InterfaceC0140c
                public final /* synthetic */ Object a(androidx.concurrent.futures.c.a aVar) {
                    return C2362Rq0.j(context, c1571Ck0, aVar);
                }
            }), interfaceC1899Is0, this.f22932d);
            c5043rr0.e(52, pVarK);
            this.f22934f = pVarK;
        }
        return "";
    }

    final /* synthetic */ String f(String str) {
        return AbstractC4040jt0.c(str) ? h(this.f22929a) : str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1573Cl0
    public final com.google.common.util.concurrent.p zza() {
        return this.f22933e.getAndSet(true) ? AbstractC5685wx0.b() : this.f22932d.e0(new Callable() { // from class: com.google.android.gms.internal.ads.Qq0
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f22459a.d();
            }
        });
    }
}
