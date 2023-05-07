import { useState } from "react"
import { TextInput, View, TouchableHighlight, StyleSheet, Text } from "react-native"

export default function App() {
  const [form, setForm] = useState({
    "nome": "Testezinho",
    "sobrenome": "da silva",
    "telefone": "(11) 91234-5679",
    "endereco": "Rua dos Testes",
  })

  const onChangeText = (text, field) => {
    let newForm = form
    newForm[field] = text
    console.log("newForm: ", newForm);
    setForm(newForm)
  }

  return (
    <View style={styles.container}>
      <>
        <TextInput
          style={styles.inputs.nome}
          placeholder="Digite seu Nome Completo"
          onChangeText={text => onChangeText(text, "nome")}
        />

        <TouchableHighlight style={styles.touchable}>
          <View style={styles.button}>
            <Text>Confirmar</Text>
          </View>
        </TouchableHighlight>
      </>

      <>
        <>
          <Text>Seu nome: {form.nome}</Text>
          <Text>Seu sobrenome: {form.sobrenome}</Text>
          <Text>Seu telefone: {form.telefone}</Text>
          <Text>Seu endereço: {form.endereco}</Text>
        </>
      </>
    </View>
  );
}

const styles = StyleSheet.create({
  inputs: {
    nome: {
      width: "80%",
      fontSize: 20,
      borderColor: "black",
      borderWidth: 1,
      padding: 10,
    }
  },

  touchable: {
    padding: 10,
  },

  button: {
    alignItems: 'center',
    backgroundColor: '#DDDDDD',
    padding: 10,
  },

  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
    margin: 10,
    borderColor: "red",
    borderWidth: 1,
  }
});