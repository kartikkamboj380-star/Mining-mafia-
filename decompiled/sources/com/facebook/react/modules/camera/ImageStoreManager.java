package com.facebook.react.modules.camera;

import android.net.Uri;
import android.util.Base64OutputStream;
import com.facebook.fbreact.specs.NativeImageStoreAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.camera.ImageStoreManager;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: loaded from: classes.dex */
@p234x3.a(name = "ImageStoreManager")
@Metadata
public final class ImageStoreManager extends NativeImageStoreAndroidSpec {
    private static final int BUFFER_SIZE = 8192;

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    public static final String NAME = "ImageStoreManager";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(Closeable closeable) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }

        public final String c(InputStream inputStream) {
            Intrinsics.checkNotNullParameter(inputStream, "inputStream");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 2);
            byte[] bArr = new byte[ImageStoreManager.BUFFER_SIZE];
            while (true) {
                try {
                    int i10 = inputStream.read(bArr);
                    if (i10 <= -1) {
                        b(base64OutputStream);
                        String string = byteArrayOutputStream.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        return string;
                    }
                    base64OutputStream.write(bArr, 0, i10);
                } catch (Throwable th) {
                    b(base64OutputStream);
                    throw th;
                }
            }
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageStoreManager(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getBase64ForTag$lambda$0(ImageStoreManager imageStoreManager, String str, Callback callback, Callback callback2) {
        try {
            InputStream inputStreamOpenInputStream = imageStoreManager.getReactApplicationContext().getContentResolver().openInputStream(Uri.parse(str));
            Intrinsics.d(inputStreamOpenInputStream, "null cannot be cast to non-null type java.io.InputStream");
            try {
                try {
                    a aVar = Companion;
                    callback.invoke(aVar.c(inputStreamOpenInputStream));
                    aVar.b(inputStreamOpenInputStream);
                } catch (IOException e10) {
                    callback2.invoke(e10.getMessage());
                    Companion.b(inputStreamOpenInputStream);
                }
            } catch (Throwable th) {
                Companion.b(inputStreamOpenInputStream);
                throw th;
            }
        } catch (FileNotFoundException e11) {
            callback2.invoke(e11.getMessage());
        }
    }

    @Override // com.facebook.fbreact.specs.NativeImageStoreAndroidSpec
    public void getBase64ForTag(@NotNull final String uri, @NotNull final Callback success, @NotNull final Callback error) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: C3.a
            @Override // java.lang.Runnable
            public final void run() {
                ImageStoreManager.getBase64ForTag$lambda$0(this.f367a, uri, success, error);
            }
        });
    }
}
