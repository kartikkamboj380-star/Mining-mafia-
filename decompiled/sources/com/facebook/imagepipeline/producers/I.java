package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.ContactsContract;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class I extends L {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f14026d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f14027e = {"_id", "_data"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ContentResolver f14028c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(Executor executor, p013b2.i pooledByteBufferFactory, ContentResolver contentResolver) {
        super(executor, pooledByteBufferFactory);
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        this.f14028c = contentResolver;
    }

    private final O2.j g(Uri uri) throws IOException {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.f14028c.openFileDescriptor(uri, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            O2.j jVarE = e(new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()), (int) parcelFileDescriptorOpenFileDescriptor.getStatSize());
            Intrinsics.checkNotNullExpressionValue(jVarE, "getEncodedImage(...)");
            parcelFileDescriptorOpenFileDescriptor.close();
            return jVarE;
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected O2.j d(U2.b imageRequest) throws IOException {
        O2.j jVarG;
        InputStream inputStreamCreateInputStream;
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        Uri uriV = imageRequest.v();
        Intrinsics.checkNotNullExpressionValue(uriV, "getSourceUri(...)");
        if (!p063g2.f.j(uriV)) {
            if (p063g2.f.i(uriV) && (jVarG = g(uriV)) != null) {
                return jVarG;
            }
            InputStream inputStreamOpenInputStream = this.f14028c.openInputStream(uriV);
            if (inputStreamOpenInputStream != null) {
                return e(inputStreamOpenInputStream, -1);
            }
            throw new IllegalStateException("Required value was null.");
        }
        String string = uriV.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (StringsKt.x(string, "/photo", false, 2, null)) {
            inputStreamCreateInputStream = this.f14028c.openInputStream(uriV);
        } else {
            String string2 = uriV.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            if (StringsKt.x(string2, "/display_photo", false, 2, null)) {
                try {
                    AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.f14028c.openAssetFileDescriptor(uriV, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
                    if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    inputStreamCreateInputStream = assetFileDescriptorOpenAssetFileDescriptor.createInputStream();
                } catch (IOException unused) {
                    throw new IOException("Contact photo does not exist: " + uriV);
                }
            } else {
                InputStream inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(this.f14028c, uriV);
                if (inputStreamOpenContactPhotoInputStream == null) {
                    throw new IOException("Contact photo does not exist: " + uriV);
                }
                inputStreamCreateInputStream = inputStreamOpenContactPhotoInputStream;
            }
        }
        if (inputStreamCreateInputStream != null) {
            return e(inputStreamCreateInputStream, -1);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected String f() {
        return "LocalContentUriFetchProducer";
    }
}
