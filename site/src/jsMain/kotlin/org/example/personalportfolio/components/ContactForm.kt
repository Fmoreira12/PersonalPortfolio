package org.example.personalportfolio.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.Width
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.style.toModifier
import org.example.personalportfolio.models.Theme
import org.example.personalportfolio.styles.ButtonStyle
import org.example.personalportfolio.styles.FormStyle
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*

@Composable
fun ContactForm() {
    Form(
        action = "https://submit-form.com/KvfKb669C",
        attrs = Modifier
            .fillMaxWidth(50.percent)
            .attrsModifier {
                attr("method", "POST")
            }
            .toAttrs(),
    ) {
        Input(
            type = InputType.Text,
            attrs = FormStyle.toModifier()
                .id("inputName")
                .classNames("form-control")
                .backgroundColor(Theme.LighterGray.rgb)
                .height(40.px)
                .width(500.px)
                .borderRadius(r = 5.px)
                .boxShadow(0.px, 0.px, 0.px, 0.px, null)
                .attrsModifier {
                    attr("placeholder", "Nome Completo")
                    attr("name", "Nome")
                    attr("required", "true")
                }
                .toAttrs()
        )
        Input(
            type = InputType.Email,
            attrs = FormStyle.toModifier()
                .id("inputEmail")
                .classNames("form-control")
                .backgroundColor(Theme.LighterGray.rgb)
                .height(40.px)
                .width(500.px)
                .borderRadius(r = 5.px)
                .margin(topBottom = 10.px)
                .boxShadow(0.px, 0.px, 0.px, 0.px, null)
                .attrsModifier {
                    attr("placeholder", "Endereço de Email")
                    attr("name", "Email")
                    attr("required", "true")
                }
                .toAttrs()
        )
        TextArea(
            attrs = FormStyle.toModifier()
                .id("inputMessage")
                .fontSize(15.px)
                .classNames("form-control")
                .backgroundColor(Theme.LighterGray.rgb)
                .borderRadius(r = 5.px)
                .margin(bottom = 10.px)
                .height(150.px)
                .width(500.px)
                .boxShadow(0.px, 0.px, 0.px, 0.px, null)
                .attrsModifier {
                    attr("placeholder", "Sua Mensagem")
                    attr("name", " Mensagem")
                    attr("required", "true")
                }
                .toAttrs()
        )
        Box(
            modifier = ButtonStyle.toModifier()
                .width(Width.MaxContent),
            contentAlignment = Alignment.Center,
        ){
            Button(
                attrs = Modifier
                    .margin(left = 210.px)
                    .height(40.px)
                    .width(80.px)
                    .border(width = 0.px)
                    .borderRadius(r = 5.px)
                    .boxShadow(blurRadius = 5.px, spreadRadius = 3.px, color = Colors.LightGray)
                    .cursor(Cursor.Pointer)
                    .toAttrs()
            ) {
                Text("Enviar")
            }
        }
    }
}