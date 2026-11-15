package com.tenjin.android.network;

import android.content.Context;
import java.security.KeyStore;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: loaded from: classes3.dex */
@Metadata
public final class TJNCertificatePinningHelper {

    @NotNull
    public static final TJNCertificatePinningHelper INSTANCE = new TJNCertificatePinningHelper();

    private TJNCertificatePinningHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean comparePublicKeys(List<? extends PublicKey> list, List<? extends PublicKey> list2) {
        Iterator<? extends PublicKey> it = list.iterator();
        while (it.hasNext()) {
            byte[] encoded = it.next().getEncoded();
            Iterator<? extends PublicKey> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (Arrays.equals(encoded, it2.next().getEncoded())) {
                    return true;
                }
            }
        }
        return false;
    }

    private final PublicKey extractPublicKey(X509Certificate x509Certificate) {
        PublicKey publicKey = x509Certificate.getPublicKey();
        Intrinsics.checkNotNullExpressionValue(publicKey, "getPublicKey(...)");
        return publicKey;
    }

    @Nullable
    public final SSLContext getPinningSSLContext(@NotNull String folder, @NotNull Context context) {
        TrustManager trustManager;
        Intrinsics.checkNotNullParameter(folder, "folder");
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            Intrinsics.checkNotNullExpressionValue(trustManagers, "getTrustManagers(...)");
            int length = trustManagers.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    trustManager = null;
                    break;
                }
                trustManager = trustManagers[i10];
                if (trustManager instanceof X509TrustManager) {
                    break;
                }
                i10++;
            }
            final X509TrustManager x509TrustManager = trustManager instanceof X509TrustManager ? (X509TrustManager) trustManager : null;
            if (x509TrustManager == null) {
                throw new IllegalStateException("No X509TrustManager found");
            }
            List<X509Certificate> listLoadCertificatesFromAssets = TJNCertificateUtils.INSTANCE.loadCertificatesFromAssets(context, folder);
            final ArrayList arrayList = new ArrayList(CollectionsKt.s(listLoadCertificatesFromAssets, 10));
            Iterator<T> it = listLoadCertificatesFromAssets.iterator();
            while (it.hasNext()) {
                arrayList.add(INSTANCE.extractPublicKey((X509Certificate) it.next()));
            }
            X509TrustManager x509TrustManager2 = new X509TrustManager() { // from class: com.tenjin.android.network.TJNCertificatePinningHelper$getPinningSSLContext$pinningTm$1
                @Override // javax.net.ssl.X509TrustManager
                public void checkClientTrusted(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str) throws CertificateException {
                    x509TrustManager.checkClientTrusted(x509CertificateArr, str);
                }

                @Override // javax.net.ssl.X509TrustManager
                public void checkServerTrusted(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str) throws CertificateException {
                    List listI;
                    x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                    if (x509CertificateArr != null) {
                        listI = new ArrayList(x509CertificateArr.length);
                        for (X509Certificate x509Certificate : x509CertificateArr) {
                            listI.add(x509Certificate.getPublicKey());
                        }
                    } else {
                        listI = CollectionsKt.i();
                    }
                    if (!TJNCertificatePinningHelper.INSTANCE.comparePublicKeys(listI, arrayList)) {
                        throw new CertificateException("Public key pinning failure");
                    }
                }

                @Override // javax.net.ssl.X509TrustManager
                @NotNull
                public X509Certificate[] getAcceptedIssuers() {
                    X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
                    Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "getAcceptedIssuers(...)");
                    return acceptedIssuers;
                }
            };
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{x509TrustManager2}, null);
            return sSLContext;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
