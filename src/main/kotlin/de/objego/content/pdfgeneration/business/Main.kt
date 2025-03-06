package de.objego.content.pdfgeneration.business

import com.ironsoftware.ironpdf.PdfDocument
import com.ironsoftware.ironpdf.Settings
import java.io.File
import java.nio.file.Paths

fun main() {
    Settings.useIronPdfEngineDocker()
    Settings.setLogPath(Paths.get("ironpdf.log"))
    Settings.setDebug(true)

    val pdfDocument = PdfDocument.renderHtmlFileAsPdf("example-hyphens.html")

    File("ironPdfOutput.pdf").writeBytes(pdfDocument.binaryData)
}
