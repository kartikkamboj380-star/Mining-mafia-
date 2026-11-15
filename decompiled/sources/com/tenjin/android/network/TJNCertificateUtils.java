package com.tenjin.android.network;

import android.content.Context;
import android.content.res.AssetManager;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.InputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

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
public final class TJNCertificateUtils {

    @NotNull
    public static final TJNCertificateUtils INSTANCE = new TJNCertificateUtils();

    private TJNCertificateUtils() {
    }

    @NotNull
    public final List<X509Certificate> loadCertificatesFromAssets(@NotNull Context context, @NotNull String folder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(folder, "folder");
        ArrayList arrayList = new ArrayList();
        try {
            AssetManager assets = context.getAssets();
            Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
            String[] list = assets.list(folder);
            if (list == null) {
                list = new String[0];
            }
            CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            for (String str : list) {
                InputStream inputStreamOpen = assets.open(folder + "/" + str);
                Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
                Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(inputStreamOpen);
                X509Certificate x509Certificate = certificateGenerateCertificate instanceof X509Certificate ? (X509Certificate) certificateGenerateCertificate : null;
                inputStreamOpen.close();
                if (x509Certificate != null) {
                    arrayList.add(x509Certificate);
                }
            }
            return arrayList;
        } catch (Exception e10) {
            e10.printStackTrace();
            return arrayList;
        }
    }
}
