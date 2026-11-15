package com.unity3d.ads.core.domain.billing;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.ConnectionResult;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p129m8.k;
import p129m8.n;
import p169q8.b;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    */
/* JADX INFO: loaded from: classes3.dex */
@Metadata
public final class ProductDetailsFetcherWithFallback implements ProductDetailsFetcher {

    @NotNull
    private final ProductDetailsFetcher primaryFetcher;

    @NotNull
    private final ProductDetailsFetcher secondaryFetcher;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback$fetchProductDetails$1, reason: invalid class name */
    @f(c = "com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback", f = "ProductDetailsFetcherWithFallback.kt", l = {16, 20, ConnectionResult.API_DISABLED_FOR_CONNECTION}, m = "fetchProductDetails")
    @Metadata
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= LinearLayoutManager.INVALID_OFFSET;
            return ProductDetailsFetcherWithFallback.this.fetchProductDetails(null, this);
        }
    }

    public ProductDetailsFetcherWithFallback(@NotNull ProductDetailsFetcher primaryFetcher, @NotNull ProductDetailsFetcher secondaryFetcher) {
        Intrinsics.checkNotNullParameter(primaryFetcher, "primaryFetcher");
        Intrinsics.checkNotNullParameter(secondaryFetcher, "secondaryFetcher");
        this.primaryFetcher = primaryFetcher;
        this.secondaryFetcher = secondaryFetcher;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0096 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x0097 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.billing.ProductDetailsFetcher
    @Nullable
    public Object fetchProductDetails(@NotNull String str, @NotNull b bVar) {
        AnonymousClass1 anonymousClass1;
        ProductDetailsFetcherWithFallback productDetailsFetcherWithFallback;
        ProductDetailsResult productDetailsResult;
        ProductDetailsResult productDetailsResult2;
        if (bVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) bVar;
            int i10 = anonymousClass1.label;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                anonymousClass1.label = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                anonymousClass1 = new AnonymousClass1(bVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(bVar);
        }
        Object objFetchProductDetails = anonymousClass1.result;
        Object objE = p179r8.b.e();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            n.b(objFetchProductDetails);
            ProductDetailsFetcher productDetailsFetcher = this.primaryFetcher;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = str;
            anonymousClass1.label = 1;
            objFetchProductDetails = productDetailsFetcher.fetchProductDetails(str, anonymousClass1);
            if (objFetchProductDetails != objE) {
                productDetailsFetcherWithFallback = this;
            }
            return objE;
        }
        if (i11 == 1) {
            str = (String) anonymousClass1.L$1;
            productDetailsFetcherWithFallback = (ProductDetailsFetcherWithFallback) anonymousClass1.L$0;
            n.b(objFetchProductDetails);
        } else {
            if (i11 == 2) {
                n.b(objFetchProductDetails);
                return objFetchProductDetails;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            productDetailsResult = (ProductDetailsResult) anonymousClass1.L$0;
            n.b(objFetchProductDetails);
        }
        productDetailsResult2 = (ProductDetailsResult) objFetchProductDetails;
        if (productDetailsResult2 instanceof ProductDetailsResult.Success) {
            return productDetailsResult2;
        }
        return productDetailsResult;
        ProductDetailsResult productDetailsResult3 = (ProductDetailsResult) objFetchProductDetails;
        if (productDetailsResult3 instanceof ProductDetailsResult.Success) {
            return productDetailsResult3;
        }
        if (productDetailsResult3 instanceof ProductDetailsResult.NotFound) {
            ProductDetailsFetcher productDetailsFetcher2 = productDetailsFetcherWithFallback.secondaryFetcher;
            anonymousClass1.L$0 = null;
            anonymousClass1.L$1 = null;
            anonymousClass1.label = 2;
            Object objFetchProductDetails2 = productDetailsFetcher2.fetchProductDetails(str, anonymousClass1);
            if (objFetchProductDetails2 != objE) {
                return objFetchProductDetails2;
            }
        } else {
            if (!(productDetailsResult3 instanceof ProductDetailsResult.Failure)) {
                throw new k();
            }
            ProductDetailsFetcher productDetailsFetcher3 = productDetailsFetcherWithFallback.secondaryFetcher;
            anonymousClass1.L$0 = productDetailsResult3;
            anonymousClass1.L$1 = null;
            anonymousClass1.label = 3;
            Object objFetchProductDetails3 = productDetailsFetcher3.fetchProductDetails(str, anonymousClass1);
            if (objFetchProductDetails3 != objE) {
                objFetchProductDetails = objFetchProductDetails3;
                productDetailsResult = productDetailsResult3;
                productDetailsResult2 = (ProductDetailsResult) objFetchProductDetails;
                if (productDetailsResult2 instanceof ProductDetailsResult.Success) {
                    return productDetailsResult2;
                }
                return productDetailsResult;
            }
        }
        return objE;
    }
}
