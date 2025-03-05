package de.objego.content.pdfgeneration.business

import com.ironsoftware.ironpdf.License
import com.ironsoftware.ironpdf.PdfDocument
import com.ironsoftware.ironpdf.Settings
import com.ironsoftware.ironpdf.internal.staticapi.License_Api
import java.io.File
import java.nio.file.Paths

fun main() {
    // Settings.useIronPdfEngineDocker()
    Settings.setLogPath(Paths.get("ironpdf.log"))
    Settings.setDebug(true)
    val licenseKey = System.getenv("IRONPDF_LICENSE_KEY")
    require(!licenseKey.isNullOrBlank()) { "License key not set" }
    License.setLicenseKey(licenseKey)

    val pdfDocument = PdfDocument.renderHtmlFileAsPdf("example-hyphens.html")

    File("ironPdfOutput.pdf").writeBytes(pdfDocument.binaryData)
}
